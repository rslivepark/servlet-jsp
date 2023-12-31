package com.smhrd.datatransfer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04Plus")
public class Ex04Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Ex04Plus() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		System.out.println(num1);
		System.out.println(num2);
	
		int result = num1 + num2;
		System.out.println(result);
		
		PrintWriter out = response.getWriter();
		out.printf("%d+%d=%d", num1, num2, result);
		
		out.close();
	}

}
