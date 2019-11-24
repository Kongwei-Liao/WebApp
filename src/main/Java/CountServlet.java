import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/scope/count")
public class CountServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //request作用域
        Integer reqCount=(Integer)req.getAttribute("REQ_IN_COUNT");
        if(reqCount==null){
            reqCount=0;
        }
        reqCount=reqCount+1;
        req.setAttribute("REQ_IN_COUNT",reqCount);
        //session作用域
        Integer sessionCount=(Integer)req.getSession().getAttribute("SESSION_IN_COUNT");
        if(sessionCount==null){
            sessionCount=0;
        }
        sessionCount=sessionCount+1;
        req.getSession().setAttribute("SESSION_IN_COUNT",sessionCount);

        //application作用域
        Integer appCount=(Integer)super.getServletContext().getAttribute("APP_IN_COUNT");
        if(appCount==null){
            appCount=0;
        }
        appCount=appCount+1;
        super.getServletContext().setAttribute("APP_IN_COUNT",appCount);

        req.getRequestDispatcher("/scope/result").forward(req,resp);


        System.out.println("/scope/count:"+super.getServletContext());
        System.out.println("/scope/count:"+super.getServletConfig().getServletContext());
        System.out.println("/scope/count:"+req.getServletContext());
        System.out.println("/scope/count:"+req.getSession().getServletContext());

        System.out.println("/scope/count:"+super.getServletContext().getContextPath());
        System.out.println("/scope/result:"+super.getServletContext().getRealPath(""));
    }
}

























