package org.example.controller;/**
 * @author 17694
 * @date 2021/05/14
 **/

/**
 * @ClassName : HelloController 
 * @Description :   
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * HelleController控制器
 */
public class HelloController implements Controller {
    private static final Log logger = LogFactory.getLog(HelloController.class);
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        logger.info("程序调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","helo");
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
