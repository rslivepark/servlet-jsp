package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.db.DAO;
import com.smhrd.model.MemberVO;


public class JoinService implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


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
		
		if (row>0) {
			// 5. 성공했다면 join_success.jsp로 forward 방식으로 이동
			// --> email 데이터를 request 영역에 담아서 이동
			request.setAttribute("email", email);
			return "join_success.jsp";
		}
		
		else {
			return "redirect:/Gomain.do";
			// redirect:/ ----> 우리끼리 정한 약속
			// redirect 방식으로 이동해야 한다는 걸 FrontController에게 알려주는 방식
		}//if

	}

}
