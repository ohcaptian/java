package pojo;
/**
 * @author 17694
 * @date 2020/11/20
 **/

/**
 * @ClassName : student 
 * @Description : 学生实体类，进行orm映射  
 */
public class Student {
        Integer sNo;
        String birth;
        int cNo;
        String sex;

    public Student() {
    }

    String sName;

    public Student(Integer sNo, String birth, int cNo, String sex, String sName) {
        this.sNo = sNo;
        this.birth = birth;
        this.cNo = cNo;
        this.sex = sex;
        this.sName = sName;
    }

    public Student(String birth, int cNo, String sex, String sName) {
        this.birth = birth;
        this.cNo = cNo;
        this.sex = sex;
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", birth='" + birth + '\'' +
                ", cNo=" + cNo +
                ", sex='" + sex + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
