package yin;/**
 * @author 17694
 * @date 2020/12/17
 **/

import pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @ClassName : ListStream 
 * @Description : list.stream学习  
 */
public class ListStream {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("测试", 1,"男", 18));
        list.add(new Student("开发", 1,"男", 20));
        list.add(new Student("运维",0, "女", 19));
        //list.add(new Student("DBA", 0,"女", 22));
        list.add(new Student("运营", 0,"男", 24));
        list.add(new Student("产品", 1,"女", 21));
        list.add(new Student("经理", 0,"女", 25));
        list.add(new Student("产品", 1,"女", 21));
        //list.add(new Student("运维",0, "女", 19));
        list.add(new Student("DBA", 0,"女", 22));
        list.add(new Student("运营", 0,"男", 24));
        list.add(new Student("产品", 1,"女", 21));
        list.add(new Student("经理", 0,"女", 25));
        list.add(new Student("产品", 1,"女", 21));
        List<Student> find1 = list.stream().filter(Student -> Student.getSex().equals("男")).collect(toList());
        Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getSex));
        System.out.println(collect);
        collect.values();
    }
}
