package exception;
/**
 * @author 17694
 * @date 2020/11/22
 **/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName : learn 
 * @Description : 异常处理  
 */

/**
 * Throwable   异常和错误的父类
 * 可查异常： CheckedException
 * 运行时异常RuntimeException
 * 错误Error
 */
public class learn {
    public static void method()throws MyException{
        throw new MyException("这里出错了");
    }
    public static void main(String[] args) {

        try {
            method();
        }catch (MyException m){
            System.out.println("异常的具体原因:"+m.getMessage());
            m.printStackTrace();
        }
        //运行时异常，不需要捕捉，主要是程序逻辑上的错误
        //任何除数不能为0:ArithmeticException
        try{int k = 5/0;}catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("我被捕捉了");
        }

        //下标越界异常：ArrayIndexOutOfBoundsException
        int j[] = new int[5];
        j[10] = 10;

        //空指针异常：NullPointerException
        String str = null;
        str.length();
        try{
            File file = new File("exception.txt");
            new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("文件不存在");
        }
        finally {
            System.out.println("hhh");
        }
        System.out.println("qqq");
    }

}
