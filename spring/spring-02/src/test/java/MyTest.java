/**
 * @author 17694
 * @date 2021/02/07
 **/
import org.junit.Test;
import com.yin.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @ClassName : Test 
 * @Description :   
 */
public class MyTest {
    @Test
    public void test() {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
