package com.yin.controller;
/**
 * @author 17694
 * @date 2021/02/06
 **/

import com.yin.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName : HelloController 
 * @Description :   
 */
@Controller
public class HelloController {
   //@RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "add";
    }
    @GetMapping("/login")
    public String login(User user){
        System.out.println(user);
        return "add";
    }
}
