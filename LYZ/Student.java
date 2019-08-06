package train.day18;

/**
 * 与studnet表映射的实体类
 */
public class Student {
    private String stuid;
    private String stuName;
    private String stuSex;
    private String stuBirthday;
    private String stuClass;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid='" + stuid + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuBirthday='" + stuBirthday + '\'' +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }
}
