package cn.bupt.learn.servlet;

import cn.bupt.learn.service.UserService;
import cn.bupt.learn.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:04 2019/7/12
 */
public class UserLoginSrevlet extends HttpServlet {
    
    private static UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == null){
            response.getWriter().write("用户名不能为空");
            response.setHeader("Refresh","5;Url="+request.getContextPath());
        }else if (password == null){
            response.getWriter().write("密码不能为空");
            response.setHeader("Refresh","5;Url="+request.getContextPath());
        }else {
            boolean login = userService.login(username, password);
            if (login){
                request.setAttribute("message","登录成功");
                request.getRequestDispatcher("/success.jsp").forward(request,response);
            }else {
                response.getWriter().write("用户名和密码不正确，请重新输入");
                response.setHeader("Refresh","5;Url="+request.getContextPath());
            }
        }
    }
}
