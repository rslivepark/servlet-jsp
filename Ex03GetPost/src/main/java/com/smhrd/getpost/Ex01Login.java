package com.smhrd.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01Login")
public class Ex01Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ex01Login() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myId = "apple";
		String myPw = "1234";
		
		response.setContentType("text/html; charset=utf-8");
		
		String getId = request.getParameter("id");
		String getPw = request.getParameter("pw");
		
		PrintWriter out = response.getWriter();
		
		if(myId.equals(getId) && myPw.equals(getPw)) {
			out.print(getId +"님 환영합니다.");
		} else {
			out.print("입력하신 정보가 없습니다.");
		}
		
	}

}
