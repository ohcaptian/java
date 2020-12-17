package pojo;/**
 * @author 17694
 * @date 2020/12/17
 **/

/**
 * @ClassName : Student 
 * @Description : 学生类  
 */
public class Student {
    private String partName;//
    private Integer type;//学生类型
    private String sex;
    private Integer years;//

    @Override
    public String toString() {
        return "Student{" +
                "partName='" + partName + '\'' +
                ", type=" + type +
                ", sex='" + sex + '\'' +
                ", years=" + years +
                '}';
    }

    public Student(String partName, Integer type, String sex, Integer years) {
        this.partName = partName;
        this.type = type;
        this.sex = sex;
        this.years = years;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }
}
