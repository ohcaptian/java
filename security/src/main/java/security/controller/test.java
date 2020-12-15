package security.controller;
/**
 * @author 17694
 * @date 2020/12/11
 **/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : test 
 * @Description :   
 */
@RestController
public class test {
        @GetMapping("/")
    public String hello(){

            return "hello";
        }
}
