import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/scope/result")
public class ScopeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer reqCount=(Integer)req.getAttribute("REQ_IN_COUNT");
        resp.getWriter().println("request:"+reqCount);

        Integer sessionCount=(Integer)req.getSession().getAttribute("SESSION_IN_COUNT");
        resp.getWriter().println("session:"+sessionCount);

        Integer appCount=(Integer)super.getServletContext().getAttribute("APP_IN_COUNT");
        resp.getWriter().println("application:"+appCount);

        System.out.println("/scope/result:"+super.getServletContext());
        System.out.println("/scope/result:"+super.getServletConfig().getServletContext());
        System.out.println("/scope/result:"+req.getServletContext());
        System.out.println("/scope/result:"+req.getSession().getServletContext());

        System.out.println("/scope/result:"+super.getServletContext().getContextPath());
        System.out.println("/scope/result:"+super.getServletContext().getRealPath(""));
    }
}
