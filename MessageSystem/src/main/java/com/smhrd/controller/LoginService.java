package com.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.db.DAO;
import com.smhrd.model.MemberVO;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginService() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		// 1. 한글 인코딩 잡아주기
		request.setCharacterEncoding("utf-8");

		// 2. 요청 데이터 꺼내주기 (2개)
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");

		// 3. 요청 데이터를 MemberVO 하나로 묶어주기
		MemberVO vo = new MemberVO();
		vo.setEmail(email);
		vo.setPw(pw);

		// 4. DAO 생성하기
		DAO dao = new DAO();
		MemberVO result = dao.login(vo);

		// 6 로그인 성공했다면

		if (result != null) {
			// 세션영역 꺼내오기
			HttpSession session = request.getSession();
			
			//세션에 
			session.setAttribute("member", result);
		} else {
			
		}

		response.sendRedirect("main.jsp");

	}

}
