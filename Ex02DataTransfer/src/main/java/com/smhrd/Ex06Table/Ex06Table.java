package com.smhrd.Ex06Table;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex06Table")
public class Ex06Table extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ex06Table() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

        // PrintWriter를 이용하여 HTML 코드를 생성 및 응답 객체에 쓰기
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Table Example</title></head>");
        out.println("<body>");

        // HTML 테이블 시작
        out.println("<table style='border-style: inset;'>");

        
        // 테이블 내용 (예제로 몇 개의 행 추가)
        out.println("<tr>");
        out.print("<td style='border-style: inset;'>1</td>");
        out.print("<td style='border-style: inset;'>2</td>");
        out.print("<td style='border-style: inset;'>3</td>");
        out.print("<td style='border-style: inset;'>4</td>");
        out.print("<td style='border-style: inset;'>5</td>");
        out.println("</tr>");


        // 테이블 끝
        out.println("</table>");

        out.println("</body></html>");
	}

}
