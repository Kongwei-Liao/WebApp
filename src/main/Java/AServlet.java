import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AServlet")
public class AServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("AServlet");
        req.getRequestDispatcher("/include/b").include(req,resp);
        resp.getWriter().println("i am aservlet");
    }
}
