package com.smhrd.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02GetPost")
public class Ex02GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Ex02GetPost() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * request 데이터 인코딩 get/post 한글 인코딩 방식 
		 * 1) post : 패킷의 body에 실어져서 전송 됨!! 
		 * -> 요청이 들어올 때마다 인코딩 방식 지정한다
		 */

		// 1
		request.setCharacterEncoding("UTF-8"); //post 방식으로 인코딩할 때

		// 2
		String name = request.getParameter("name");

		//////////////////////////////////////////////////////////////////////////////
		/* 
		 * 2) get : url 주소에 실려 데이터가 전송되기 때문에 url 인코딩이 필요하다
		 * Servers -> server.xml -> <connector> -> urlEncoding="utf-8" 지정
		 * 
		 * */
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(name);
	}

}
