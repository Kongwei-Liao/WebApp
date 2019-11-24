package cn.ant_nest.JavaBean;

import cn.ant_nest.JavaBean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //设置编码
        req.setCharacterEncoding("UTF-8");
        //接收参数
        String name=req.getParameter("name");
        String pwd=req.getParameter("pwd");

        User user=new User();
        user.setName(name);
        user.setPwd(pwd);

        if("admin".equals(name)&&"123".equals(pwd)){
            //登录成功
            req.getSession().setAttribute("user",user);
            //登陆成功调整main.jsp
            resp.sendRedirect("main.jsp");
            return;
        }
        //如果用户不存在
        req.setAttribute("error","登录失败");
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }
}
