package com.smhrd.Ex03Number;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Number")
public class Ex03Number extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ex03Number() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		int num = Integer.parseInt(request.getParameter("number"));
		PrintWriter out = response.getWriter();
		out.printf("입력한 숫자는 %d입니다.", num);
		
	}

}
