package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02Servlet")
public class Ex02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Ex02Servlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 실행됨");
	}

	public void destroy() {
		System.out.println("destroy 실행됨");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service 실행됨");
		//웹페이지 열리면서 실행됨
		//doGet, doPost로 보내도 service가 실행됨
		//doGet, doPost로 보내고 싶다면 service 없애면 됨..
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet 실행됨");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		System.out.println("doPost 실행됨");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPut 실행됨");
	}


	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doDelete 실행됨");
	}

}
