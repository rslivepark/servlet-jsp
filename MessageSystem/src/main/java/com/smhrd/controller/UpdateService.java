package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.db.DAO;
import com.smhrd.model.MemberVO;

/**
 * Servlet implementation class UpdateService
 */
@WebServlet("/UpdateService")
public class UpdateService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* 
			1. 한글 인코딩 
			
			2. 요청 데이터 꺼내오기(3개)
			
			3. 세션 영역안에 있는 이메일 데이터 꺼내오기
				1) 세션 꺼내오기
				2) 세션 영역 안에 있는 member라는 이름표 데이터 꺼내오기
				3) email 값만 꺼내오기
			
			4. 꺼내온 데이터들을 모두 하나로 묶어주기
			
			5. DAO 생성하기
			
			6. dao.update 기능 사용하기
			
			7. 수정 성공했다면 session 영역 안에 있는 데이터 변경
			
			8. main.jsp로 redirect방식으로 이동
		
		*/
		
		//1
		request.setCharacterEncoding("utf-8");
		
		//2
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		//3
		HttpSession session = request.getSession();	
        MemberVO sessionVO = (MemberVO) session.getAttribute("member");
        String email = sessionVO.getEmail();
        // member라는 이름으로 저장된 MemberVO 객체를 가져와 그 안에 있는 이메일 정보를 추출
						
//      sessionVO.setPw(pw);
//      sessionVO.setTel(tel);
//		sessionVO.setAddress(address);
        
        //4
        MemberVO vo = new MemberVO();
        vo.setPw(pw);
        vo.setTel(tel);
        vo.setAddress(address);
        
		//5	
        DAO dao = new DAO();
        
        //6
        int row = dao.update(vo);
        
        
        //7
        if (row > 0 ) { 
        	/* 1. 걍 주소값 복사하는게 더 간편...
        	session = vo;  
        	*/
        	
        	// sessionVO 영역안에 있는 데이터 변경 방식 사용
        	sessionVO.setPw(pw);
        	sessionVO.setTel(tel);
        	sessionVO.setAddress(address);
        }
        
        //8
        response.sendRedirect("main.jsp"); // 결과 페이지 경로로 변경
        
		
	}
}

