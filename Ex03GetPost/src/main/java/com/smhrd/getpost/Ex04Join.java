package com.smhrd.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04Join")
public class Ex04Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Ex04Join() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); //post방식
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwCheck = request.getParameter("pwCheck");
		String gender = request.getParameter("gender");
		String bloodtype = request.getParameter("bloodtype");
		String birthday = request.getParameter("birthday");
		String[] hobbys = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String comment = request.getParameter("comment");
		
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pw + "<br>");
		
		
		if(pw.equals(pwCheck)) {
			out.print("비밀번호가 일치합니다." + "<br>");
		} else {
			out.print("비밀번호가 일치하지 않습니다." + "<br>");
		}
		
		out.print("성별 : " + gender + "<br>");
		out.print("혈액형 : " + bloodtype + "<br>");
		out.print("생일 : " + birthday + "<br>");
		out.print("취미 : ");
		for(String x : hobbys) {
			out.print(x + " ");
		}
		out.print("<br>");
		out.print("좋아하는 색 : " + color+ "<br>");
		out.print("남기고 싶은 말 : " + comment);
		
		out.close();
	}

}
