package mybatisplus.handle;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mybatisplus.entity.User;
import mybatisplus.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 17694
 * @date 2020/12/15
 **/
@SpringBootTest
class MyMetaObjectHandlerTest {
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void testAutoFill() {
        User user = new User();
        user.setName("java").setAge(20).setEmail("tom@163.com");
        if (userService.save(user)) {
            userService.list().forEach(System.out::println);
        } else {
            System.out.println("添加数据失败");
        }
    }
    @Test
    public void page(){
        Page<User> page = new Page<>(2,5);
        userService.page(page, null);
        System.out.println(page.getCurrent()); // 获取当前页
        System.out.println(page.getTotal()); // 获取总记录数
        System.out.println(page.getSize()); // 获取每页的条数
        System.out.println(page.getRecords()); // 获取每页数据的集合
        System.out.println(page.getPages()); // 获取总页数
        System.out.println(page.hasNext()); // 是否存在下一页
        System.out.println(page.hasPrevious()); // 是否存在上一页
    }
}