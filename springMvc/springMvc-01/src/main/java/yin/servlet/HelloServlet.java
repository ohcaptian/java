package yin.servlet; /**
 * @author 17694
 * @date 2021/02/03
 **/

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName : yin.servlet.HelloServlet
 * @Description :   
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1，获取前台数据
        String mess = req.getParameter("mess");
        if(mess.equals("hello")){
            req.getSession().setAttribute("msg","成功");
        }else {
            req.getSession().setAttribute("msg","失败");
        }
        //2，调用业务层
        //3，转发或者重定向
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
