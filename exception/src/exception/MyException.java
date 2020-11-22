package exception;
/**
 * @author 17694
 * @date 2020/11/22
 **/

/**
 * @ClassName : MyException 
 * @Description : 自定义异常  
 */
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
