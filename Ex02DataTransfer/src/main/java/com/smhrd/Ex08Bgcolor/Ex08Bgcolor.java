package com.smhrd.Ex08Bgcolor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08Bgcolor")
public class Ex08Bgcolor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Ex08Bgcolor() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color = request.getParameter("color");
		System.out.println(color);
		PrintWriter out = response.getWriter();
		out.print("<html><body bgcolor="+color+"></body></html>");
		out.close();
	}

}
