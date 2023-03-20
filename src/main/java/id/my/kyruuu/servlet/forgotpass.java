package id.my.kyruuu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "forgotpass", value = "/forgotpass")
public class forgotpass extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("uname");
        String path = req.getContextPath();

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body><script>prompt('hi " + username + " input OTP code that we send through your email');alert('wrong'); window.location.href= location.protocol + '//' + location.host + '"+ path +"'</script></body></html>");
    }
}
