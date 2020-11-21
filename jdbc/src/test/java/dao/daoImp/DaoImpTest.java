package dao.daoImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pojo.Student;
import util.BirthRandom;

import java.util.List;


/**
 * @author 17694
 * @date 2020/11/19
 **/
class DaoImpTest {
    //static Logger logger = Logger.getLogger(DaoImpTest.class);
    @Test
    void getTotal() {
        DaoImp dao = new DaoImp();
        int total = dao.getTotal();
        Assert.assertNotEquals(0,total);
        System.out.println(total);

    }
    @Test
    void getStudent(){
        DaoImp dao = new DaoImp();
        Student s1 = (Student) dao.select(1);
        System.out.println(s1);
    }
    @Test
    void addStudent(){
        Student s =new Student(new BirthRandom().randomDate(),1001,"男","小红");
        DaoImp dao = new DaoImp();
        for (int i = 0; i <5 ; i++) {
            dao.add(s);
        }
    }
    
    @Test
    public void Select(){
        DaoImp dao = new DaoImp();
        List<Student> students = dao.select(1, 6);
        students.forEach(s-> System.out.println(s));
    }
}
