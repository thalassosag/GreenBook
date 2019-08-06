package homework.day19;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentOperator implements StudentOperatable {

    /**
     * 查询全部学生信息
     * @return 学生信息列表
     */
    @Override
    public List<Student> findAllStudents() {
        Connection connection = null;
        try {
            connection = JdbcUtil.getInstance().getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<Student> studentList = new ArrayList<>();
        String sql = "select * from student";
        try {
            preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();

            //将学生信息取出进行封装
            while (rs.next()) {
                String sno = rs.getString(2);
                String sname = rs.getString(3);
                String ssex = rs.getString(4);

                //封装
                Student student = new Student();
                student.setStuid(sno);
                student.setStuName(sname);
                student.setStuSex(ssex);
                studentList.add(student);
            }
            studentList.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.getInstance().closeResource(rs);
            JdbcUtil.getInstance().closeResource(preparedStatement);
            JdbcUtil.getInstance().closeResource(connection);
        }
        return studentList;
    }

    @Override
    public int updateStudentById(Student student) {
        return 0;
    }

    /**
     * 插入学生数据
     * @param student :要插入的学生信息
     * @return
     */
    @Override
    public int insertStudnent(Student student) {
        Connection connection = null;
        try {
            connection = JdbcUtil.getInstance().getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        //防止注入
        String sql = "insert into student values(null,?,?,?)";
        ResultSet rs = null;
        try {
            //给preparedStatement设置参数
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,student.getStuid());
            preparedStatement.setString(2,student.getStuName());
            preparedStatement.setString(3,student.getStuSex());
            int affectedRows = preparedStatement.executeUpdate();
            if(affectedRows > 0){
                System.out.println("插入成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.getInstance().closeResource(preparedStatement);
            JdbcUtil.getInstance().closeResource(connection);
        }
        return 0;
    }

    @Override
    public int deleteStudnentById(int id) {
        return 0;
    }

    /**
     * 完成stuName字段模糊查找
     * @param stuName
     * @return
     */
    @Override
    public List<Student> queryByStudentNameLike(String stuName) {
        List<Student> studentList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = JdbcUtil.getInstance().getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String sql = "select * from student where sname like '%" + stuName + "%'";
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                Student student = new Student();
                student.setStuid(rs.getString(2));
                student.setStuName(rs.getString(3));
                student.setStuSex(rs.getString(4));
                studentList.add(student);
            }
            studentList.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭连接
            JdbcUtil.getInstance().closeResource(preparedStatement);
            JdbcUtil.getInstance().closeResource(connection);
        }
        return null;
    }


    /**
     * 根据sname字段进行排序（降序）的操作
     * @return
     */
    public List<Student> findOrderByUserName(){
        Connection connection = null;
        try {
            connection = JdbcUtil.getInstance().getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        //降序排列
        String sql = "select * from student order by sname desc";
        List<Student> studentList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(sql);
            rs = preparedStatement.executeQuery();

            //将学生信息取出进行封装
            while (rs.next()) {
                String sno = rs.getString(2);
                String sname = rs.getString(3);
                String ssex = rs.getString(4);

                //封装
                Student student = new Student();
                student.setStuid(sno);
                student.setStuName(sname);
                student.setStuSex(ssex);
                studentList.add(student);
            }
            studentList.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭连接
            JdbcUtil.getInstance().closeResource(preparedStatement);
            JdbcUtil.getInstance().closeResource(connection);
        }
        return studentList;
    }

    /**
     * 某个字段模糊查找并排序（升序），然后分页获取第二页数据的操作（每页显示2条）
     * @param stuName
     * @param currPage
     * @param pageSize
     * @return
     */
    @Override
    public List<Student> findByStudentNameLikeOrderLimit(String stuName, int currPage, int pageSize) {
        Connection connection = null;
        try {
            connection = JdbcUtil.getInstance().getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Statement statement = null;
        ResultSet rs = null;
        List<Student> studentList = new ArrayList<>();
        try {
            statement = connection.createStatement();
            String sql = "select * from student where sname like '%" + stuName + "%' order by '" + stuName + "'";
            System.out.println(sql);
            rs = statement.executeQuery(sql);

            //将学生信息取出进行封装
            while (rs.next()) {
                String sno = rs.getString(2);
                String sname = rs.getString(3);
                String ssex = rs.getString(4);

                //封装
                Student student = new Student();
                student.setStuid(sno);
                student.setStuName(sname);
                student.setStuSex(ssex);
                studentList.add(student);
            }
            page(studentList,currPage,pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.getInstance().closeResource(rs);
            JdbcUtil.getInstance().closeResource(statement);
            JdbcUtil.getInstance().closeResource(connection);
        }
        return studentList;
    }

    /**
     * 完成分页操作
     * @param studentList
     * @param currPage
     * @param pageSize
     */
    public void page(List<Student> studentList,int currPage, int pageSize){
        int totalInfo = studentList.size();
        int totalPages = 0;
        if(totalInfo % 2 == 0){
            totalPages = totalInfo / 2;
        }else {
            totalPages = totalInfo / 2 + 1;
        }
        for (int i = (currPage - 1) * pageSize; i < ((currPage * pageSize) > totalInfo ? totalInfo:(currPage  * pageSize)); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }


}
