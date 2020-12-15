package mybatisplus.controller;/**
 * @author 17694
 * @date 2020/12/15
 **/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : TestController 
 * @Description :   
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "success";
    }
}
