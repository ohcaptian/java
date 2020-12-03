package com.ying.cloud.controller;
/**
 * @author 17694
 * @date 2020/11/27
 **/

import com.ying.cloud.dao.ProductDao;
import com.ying.cloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;


/**
 * @ClassName : HelloController 
 * @Description : 测试  
 */
@Controller
public class HelloController {
    @Autowired
    private  ProductDao productDao;
    //ProductDao productDao =new ProductDao();
    @GetMapping("/")
    public String hello(Model m){
        m.addAttribute("name","thymeleaf");
        return "hello";
    }
    @RequestMapping("/test")
    public String test(Model m) {
        String htmlContent = "<p style='color:red'> 红色文字</p>";
        Product currentProduct =new Product(5,"product e", 200);
        boolean testBoolean = false;
        m.addAttribute("htmlContent", htmlContent);
        m.addAttribute("currentProduct", currentProduct);
        m.addAttribute("testBoolean",testBoolean);
        Collection<Product> products = productDao.selectAll();
        m.addAttribute("products",products);
        return "test";
    }

}
