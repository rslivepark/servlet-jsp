package com.smhrd.datatransfer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07MakeTable")
public class Ex07MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ex07MakeTable() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html charset=UTF-8");
		
		int num = Integer.parseInt(request.getParameter("number"));
		PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>테이블 만들기</title></head>");
        out.println("<body>");

        // HTML 테이블 시작
        out.println("<table style='border-style: inset;'>");
		
		out.println("<tr>");
		
		for(int i = 1; i<=num; i++) {
			out.print("<td style='border-style: inset;'>" + i + "</td>");
		}
		
		out.println("</tr>");
		out.println("</table>");
        out.println("</body></html>");
		
        out.close();
		

      
	}

}
