package com.smhrd.Ex09Gugu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex09Gugu")
public class Ex09Gugu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Ex09Gugu() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String bgColor = request.getParameter("color");
		
		
		PrintWriter out = response.getWriter();
		
		int result;


	        // HTML 테이블 시작
	        out.println("<table bgcolor=" + bgColor +" style='border-style: inset;'>");
			
			out.println("<tr>");
		
		for(int i=num1; i<=num2 ; i++) {
			for(int j=1; j<=9; j++) {
				result = num1 * j;
				out.print("<td style='border-style: inset;'>");
				out.printf("%d*%d=%d\t", num1, j, result);
				out.print("</td>");
				
			}//for
			num1++;
			out.println("</tr>");
		}//for
		out.println("</table>");
		out.close();
	}

}
