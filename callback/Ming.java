/**
 * @author 17694
 * @date 2021/05/10
 **/

/**
 * @ClassName : Ming 
 * @Description :   
 */
public class Ming implements Student{
    @Override
    public void resolveQuestion(CallBack callback) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        // 回调，告诉老师作业写了多久
        callback.tellAnswer(3);
    }
}
