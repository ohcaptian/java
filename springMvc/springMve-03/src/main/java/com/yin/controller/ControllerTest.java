package com.yin.controller;/**
 * @author 17694
 * @date 2021/02/06
 **/

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName : ControllerTest 
 * @Description :   
 */
public class ControllerTest implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","testdddd");
        mv.setViewName("/test");
        return mv;
    }
}
