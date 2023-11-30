package com.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.db.DAO;
import com.smhrd.model.MemberVO;


@WebServlet("/SelectAllService")
public class SelectAllService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SelectAllService() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* 
		1. DAO 생성하기
		
		2. dao.selectAll()
		
		select email. tel, address
		from web_member
		where email != 'admin'
		
		결과값으로 어떤 자료형을 받아와야 할까??
		
		3. 조회한 결과를 request 영역에 list라는 이름으로 담아주기
		
		4. select.jsp로 forward 방식 이동
		
		
		*/
	
		//1
		DAO dao = new DAO();
		
		//2
		
		//3
		List<MemberVO> resultList = dao.selectAll();
		request.setAttribute("list", resultList); 		
				
		// 4
		RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
		rd.forward(request, response);
	
	}

}
