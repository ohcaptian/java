package mybatisplus.service.impl;

import mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author 17694
 * @date 2020/12/15
 **/

@ExtendWith(SpringExtension.class) //导入spring测试框架
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private  UserServiceImpl userService;
    @Test
    public void test(){
        User user = new User();
        user.setName("tom").setAge(20).setEmail("tom@163.com");
        boolean save = userService.save(user);
        System.out.println("hhh");
    }


}