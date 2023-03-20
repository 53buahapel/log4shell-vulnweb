package id.my.kyruuu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(name = "loginservlet", value = "/login4j")
public class loginservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("uname");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        if (userName.contains("jndi")) {
            userName = userName.replaceAll("jndi", "");
        }

        Logger logger = LogManager.getLogger(id.my.kyruuu.servlet.log4j.class);
        logger.error(userName);

        out.println("<code> username or password you entered was invalid, <u> we will log your information </u> </code>");
        }
    }
