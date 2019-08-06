package day19.homework;

import day18.Stu;
import day19.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QueryOrderByDegree {
    public static void main(String[] args) {
        queryOrderByDegree();
    }

    /**
     * 根据成绩查询并降序排序
     * @return 返回查询到的学生集合
     */
    public static List<Stu> queryOrderByDegree(){

        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = null;

        String sql = "select * from score order by degree desc";

        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            System.out.println(sql);
            while (rs.next()){

                int id = rs.getInt(1);
                String snumber = rs.getString("sno");
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
