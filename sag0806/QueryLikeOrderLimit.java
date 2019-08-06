package day19.homework;

import day18.Stu;
import day19.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QueryLikeOrderLimit {
    public static void main(String[] args) {
        queryBySnoLikeOrderLimit("10",1,2);
    }

    /**
     * 根据学号进行模糊查询，并进行分页
     * @param sno 学号
     * @param currPage 当前需要查询的页数
     * @param pageSize 每一页显示的数据个数
     * @return 返回查找到的学生集合
     */
    public static List<Stu> queryBySnoLikeOrderLimit(String sno, int currPage, int pageSize){

        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = null;
        int total = 0;
        int TotalPages = 0;
        int cursor = currPage*pageSize;
        String csql = "select count(*) from score";
        String sql = "select * from score where sno like '"
                + sno +"%'" +" order by degree";
        try {
            preparedStatement = connection.prepareStatement(csql);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                total = rs.getInt(1);
                TotalPages = total / pageSize;
            }
            if (total>0){
                sql = sql + " Limit " + cursor + "," + pageSize;
            }
            System.out.println(sql);
            rs = preparedStatement.executeQuery(sql);
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
