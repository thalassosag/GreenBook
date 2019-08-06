package day18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StuOperate implements StuOperatable{

    @Override
    public List<Stu> findAllStu() {
        Connection connection = JdbcUtil.getInstance().getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        List<Stu> list = new ArrayList<>();
        try {
            statement = connection.createStatement();
            String sql = "select * from score";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String sno = resultSet.getString(2);
                String cno = resultSet.getString(3);
                double score = resultSet.getDouble(4);

                Stu stu = new Stu();
                stu.setId(id);
                stu.setSno(sno);
                stu.setCno(cno);
                stu.setScore(score);
                System.out.println(stu.toString());
                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.getInstance().closeResource(resultSet);
            JdbcUtil.getInstance().closeResource(statement);
            JdbcUtil.getInstance().closeResource(connection);
        }

        return list;
    }

    @Override
    public int updateStuByid(Stu stu) {
        Connection connection = JdbcUtil.getInstance().getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("insert into score values(null,");
            stringBuffer.append("'");
            stringBuffer.append(stu.getSno());
            stringBuffer.append("','");
            stringBuffer.append(stu.getCno());
            stringBuffer.append("',");
            stringBuffer.append(stu.getScore());
            stringBuffer.append(")");
            String sql = stringBuffer.toString();
            System.out.println(stringBuffer);
            int affectedRows = statement.executeUpdate(sql);

            return affectedRows;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.getInstance().closeResource(statement);
            JdbcUtil.getInstance().closeResource(connection);
        }
        return 0;
    }

    @Override
    public int insertStu(Stu stu) {
        return 0;
    }

    @Override
    public int deleteHeroById(int id) {
        return 0;
    }
}
