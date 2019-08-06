package homework.day19;

import java.util.List;

public interface StudentOperatable {
    /**
     * 查询所有数据，将所有数据封装到集合中返回
     */
    List<Student> findAllStudents() ;

    /**
     * 修改信息
     * @param student 待修改的对象
     * @return 执行sql后受影响的行数
     */
    int updateStudentById(Student student);

    /**
     * 添加数据
     * @param student
     * @return 执行sql后受影响的行数
     */
    int insertStudnent(Student student);

    /**
     * 根据id删除
     * @param id
     * @return 执行sql后受影响的行数
     */
    int deleteStudnentById(int id);

    /**
     * 根据名字字段模糊查找
     * @param stuName
     * @return
     */
    List<Student> queryByStudentNameLike(String stuName);

    /**
     * 根据名字字段进行排序（降序）的操作
     * @return
     */
    List<Student> findOrderByUserName();

    /**
     * 分页
     * @param stuName
     * @param currPage
     * @param pageSize
     * @return
     */
    List<Student> findByStudentNameLikeOrderLimit(String stuName,int currPage, int pageSize);

}
