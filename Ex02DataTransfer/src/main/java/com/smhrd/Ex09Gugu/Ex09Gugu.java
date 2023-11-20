package com.smhrd.Ex09Gugu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex09Gugu
 */
@WebServlet("/Ex09Gugu")
public class Ex09Gugu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex09Gugu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		String bgColor = request.getParameter("color");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body bgcolor="+bgColor+"></body></html>");

		int result;
		
		for(int i=num1; i<=num2 ; i++) {
			for(int j=1; j<=9; j++) {
				result = num1 * j;
				out.printf("%d*%d=%d\t", num1, j, result);
			}
			num1++;
			out.print("<br>");
		}//for
		
		
	}

}
