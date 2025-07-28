package com;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class Loginservlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy login check (You can later replace this with DB check)
        if ("admin".equals(username) && "1234".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("dashboard.html"); // Redirect to dashboard
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Invalid username or password</h3>");
        }
    }
}
