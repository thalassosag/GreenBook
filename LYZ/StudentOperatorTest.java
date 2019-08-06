package train.day18;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentOperatorTest {

    @Test
    public void findAllStudents() {
        StudentOperator studentOperator = new StudentOperator();
        studentOperator.findAllStudents();
    }

    @Test
    public void updateStudentById() {

    }

    @Test
    public void insertStudnent() {
        Student student = new Student();
        student.setStuid("002");
        student.setStuName("小明");
        student.setStuSex("男");
        student.setStuClass("123456");
        student.setStuBirthday("1999-02-06");
        StudentOperator studentOperator = new StudentOperator();
        studentOperator.insertStudnent(student);
    }

    @Test
    public void deleteStudnentById() {
    }
}