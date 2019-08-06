package day18;

import org.junit.Test;

import static org.junit.Assert.*;

public class StuOperateTest {

    Stu stu = new Stu();
    public void test(){
        stu.setSno("110");
        stu.setCno("3-110");
        stu.setScore(120);
    }
    @Test
    public void findAllStu() {
        StuOperate stuOperate = new StuOperate();
        stuOperate.findAllStu();
    }

    @Test
    public void updateStuByid() {
        test();
        StuOperate stuOperate = new StuOperate();
        stuOperate.updateStuByid(stu);
    }

    @Test
    public void insertStu() {
    }

    @Test
    public void deleteHeroById() {
    }
}