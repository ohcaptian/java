package com.ying.cloud.controller;
/**
 * @author 17694
 * @date 2020/11/27
 **/

import com.ying.cloud.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @ClassName : HelloController 
 * @Description : 测试  
 */
@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(Model m){
        m.addAttribute("name","thymeleaf");
        return "hello";
    }
    @RequestMapping("/test")
    public String test(Model m) {
        String htmlContent = "<p style='color:red'> 红色文字</p>";
        Product currentProduct =new Product(5,"product e", 200);

        m.addAttribute("htmlContent", htmlContent);
        m.addAttribute("currentProduct", currentProduct);

        return "test";
    }
}
