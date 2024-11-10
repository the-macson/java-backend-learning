package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {
//    method
//    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Hello World Servlet");
        PrintWriter out = res.getWriter();
//        res.getWriter().println("Hello world");
        res.setContentType("text/html");
        out.println("Hello World Servlet");
    }

}
