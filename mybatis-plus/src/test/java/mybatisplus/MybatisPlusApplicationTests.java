package mybatisplus;

import mybatisplus.entity.User;
import mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println("-------test-------");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
