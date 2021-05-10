/**
 * @author 17694
 * @date 2021/02/07
 **/

import com.yin.dao.imp.UserDaoImp;
import com.yin.dao.imp.UserDaoMySqlImpl;
import com.yin.service.UserService;
import com.yin.service.impl.UserServiceImpl;
import org.junit.Test;
/**
 * @ClassName : Test1
 * @Description :   
 */

public class Test1 {
    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        service.setUserDao(new UserDaoMySqlImpl());
        service.getUserNew();
        //那我们现在用Oracle去实现呢
        service.setUserDao(new UserDaoImp());
        service.getUserNew();
    }

}
