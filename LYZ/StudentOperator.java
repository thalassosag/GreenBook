package train.day18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentOperator implements StudentOperatable {

    @Override
    public List<Student> findAllStudents() {
        Connection connection = JdbcUtil.getInstance().getConnection();
        Statement statement = null;
        ResultSet rs = null;
        List<Student> studentList = new ArrayList<>();
        try {
            statement = connection.createStatement();
            String sql = "select * from student";
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                String sno = rs.getString(1);
                String sname = rs.getString(2);
                String ssex = rs.getString(3);
                String sbirthday = rs.getString(4);
                String sclass = rs.getString(5);

                //封装
                Student student = new Student();
                student.setStuid(sno);
                student.setStuName(sname);
                student.setStuSex(ssex);
                student.setStuBirthday(sbirthday);
                student.setStuClass(sclass);
                //System.out.println(student.toString());
                studentList.add(student);
                //System.out.println(sno + "," +sname + "," +ssex + "," +sbirthday + "," +sclass  );

            }
            studentList.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            JdbcUtil.getInstance()
        }
        return studentList;
    }

        @Override
    public int updateStudentById(Student student) {
        return 0;
    }

    @Override
    public int insertStudnent(Student student) {
        Connection connection = JdbcUtil.getInstance().getConnection();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.createStatement();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("insert into student values(");
            stringBuffer.append("'");
            stringBuffer.append(student.getStuid());
            stringBuffer.append("'");
            stringBuffer.append(",");
            stringBuffer.append("'");
            stringBuffer.append(student.getStuName());
            stringBuffer.append("'");
            stringBuffer.append(",");
            stringBuffer.append("'");
            stringBuffer.append(student.getStuSex());
            stringBuffer.append("'");
            stringBuffer.append(",");
            stringBuffer.append("'");
            stringBuffer.append(student.getStuBirthday());
            stringBuffer.append("'");
            stringBuffer.append(",");
            stringBuffer.append("'");
            stringBuffer.append(student.getStuClass());
            stringBuffer.append("')");
            int affectedRows = statement.executeUpdate(stringBuffer.toString());
            if(affectedRows > 0){
                System.out.println("插入成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.getInstance().closeResource(statement);
            JdbcUtil.getInstance().closeResource(connection);
        }
        return 0;
    }

    @Override
    public int deleteStudnentById(int id) {
        return 0;
    }

}
