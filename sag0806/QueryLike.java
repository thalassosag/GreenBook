package day19.homework;

import day18.Stu;
import day19.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QueryLike {
    public static void main(String[] args) {

        querySnoByIdLike("10");
    }

    /**
     * 根据学号查找学生信息
     * @param sno 学号
     * @return 返回查找到的学生集合
     */
    public static List<Stu> querySnoByIdLike(String sno){

        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = null;

        String sql = "select * from score where sno like '" + sno +"%'";
        System.out.println(sql);

        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String snumber = rs.getString(2);
                String cno = rs.getString(3);
                double score = rs.getDouble(4);
                Stu stu = new Stu();
                stu.setId(id);
                stu.setSno(snumber);
                stu.setCno(cno);
                stu.setScore(score);
                System.out.println(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeResource(preparedStatement);
            JdbcUtil.closeResource(connection);
        }


        return null;
    }
}
