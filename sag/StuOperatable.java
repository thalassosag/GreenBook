package day18;

import java.util.List;

public interface StuOperatable {
    /**
     * 查询所有数据
     * @return 将所有数据封装到集合中返回
     */
    List<Stu> findAllStu();

    /**
     * 修改信息
     * @param stu 待修改的对象
     * @return 执行sql后受影响的行数
     */
    int updateStuByid(Stu stu);

    /**
     * 添加数据
     * @param stu
     * @return
     */
    int insertStu(Stu stu);

    int deleteHeroById(int id);


}
