package com.neuedu.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = -3020479620559456461L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html;");
        String id=request.getParameter("id");
        System.out.println("id="+id);
        String name = request.getParameter("name");
        System.out.println("name="+name);
        pw.println("<html><head></head><body><div style='width:200px;height:300px;background:#00ff00'></div></body></html>");
    }
}
