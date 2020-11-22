package test;
/**
 * @author 17694
 * @date 2020/11/22
 **/

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName : Test 
 * @Description : 测试反射用法  
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * 非反射方法调用方法
         */
        //new Service1().doService1();
       // new Service2().doService2();
        /**
         * 通过反射调用方法
         */
        File springConfigFile = new File("G:\\java\\reflection\\src\\spring.txt");
        Properties springConfig= new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");

        //根据类名称获取类对象
        Class clazz = Class.forName(className);
        //根据方法名称，获取方法对象
        Method m = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器，实例化出对象
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);
            }
        }
