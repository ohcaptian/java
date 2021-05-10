package lean;/**
 * @author 17694
 * @date 2021/03/26
 **/

/**
 * @ClassName : CommonResult 
 * @Description :   
 */
public class CommonResult <T>{
    private long code;
    private String message;
    private T data;

    protected CommonResult() {
    }
    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


}
