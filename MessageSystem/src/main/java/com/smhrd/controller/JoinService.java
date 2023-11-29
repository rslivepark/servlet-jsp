package com.smhrd.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.db.DAO;
import com.smhrd.model.MemberVO;

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 0. 한글 인코딩 잡아주기
		request.setCharacterEncoding("utf-8");

		// 1. 요청받은 데이터 꺼내오기
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		// 2. MemberVO라는 클래스를 생성해서 요청받은 데이터를 하나로 묶어주기

		// 2-1) MemverVO vo라는 객체 생성
		// 2-2) setter 메소드 사용해서 데이터 보관
		MemberVO vo = new MemberVO();
		vo.setEmail(email);
		vo.setPw(pw);
		vo.setTel(tel);
		vo.setAddress(address);

		
		// 3. DAO 생성하기
		DAO dao = new DAO();
		
		// 4. DAO 사용하기
		int row = dao.join(vo);
		
		
		// 5. 성공했다면 join_success.jsp로 forward 방식으로 이동
		// --> email 데이터를 request 영역에 담아서 이동
		
		if (row>0) {
			request.setAttribute("email", email);
			
			// request를 유지하면서 응답을 되돌려 줄 수 있는 rd 객체 가져오기
			RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			
			// rd 객체 사용해서 forward 방식 이동
			rd.forward(request, response);
		}
		
		// 6. 실패했다면 main.jsp로 redirect 방식 이동
		else {
			response.sendRedirect("main.jsp");
		}//if

	}

}
