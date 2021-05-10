package com.yin.test;/**
 * @author 17694
 * @date 2020/12/28
 **/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName : SecurityController 
 * @Description :   
 */
@Controller
public class SecurityController {
    @GetMapping(value = {"/home","/"})
    public String home(){
        return "home";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

}
