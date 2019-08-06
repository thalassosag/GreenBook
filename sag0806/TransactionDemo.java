package day19.homework;

import day19.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 生成四个银行账户，分别为ABCD四个个银行账户，
 */
public class TransactionDemo {
    public static void main(String[] args) {
        saveMoney("A","B",100,100);
    }

    /**
     * 简单模拟存钱操作
     * @param user1 用户1
     * @param user2 用户2
     * @param money1 存钱金额1
     * @param money2 取钱金额2
     */
    public static void saveMoney(String user1 ,String user2, int money1, int money2){
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = null;
        //自动提交默认开启，手动设置关闭后要自己进行提交，实现持久化
        try {
            connection.setAutoCommit(false);

            String sql = "update amount set money = money +"+money1+" where id = '"+user1+"'";
            System.out.println(sql);
            String sql2 = "update amount set money = money -"+money2+" where id = '"+user2+"'";
            System.out.println(sql2);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            //①
            connection.rollback();

            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            //②
            connection.commit();

            //①②均不执行，表不变  ①② 均执行 B减100
            //①执行②不执行 表不变  ①不执行②执行A加100，B减100
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeResource(preparedStatement);
            JdbcUtil.closeResource(connection);
        }
    }
}
