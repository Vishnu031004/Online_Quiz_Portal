package com;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class Dashboardservlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("username") != null) {
            response.setContentType("text/html");
            response.getWriter().println("<h2>Welcome, " + session.getAttribute("username") + "</h2>");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
