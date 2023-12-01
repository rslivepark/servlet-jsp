package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.db.DAO;
import com.smhrd.model.MemberVO;

public class UpdateService implements Command  {
       
	public String execute (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		HttpSession session = request.getSession();	
        MemberVO sessionVO = (MemberVO) session.getAttribute("member");
        String email = sessionVO.getEmail();

    
        MemberVO vo = new MemberVO();
        vo.setPw(pw);
        vo.setTel(tel);
        vo.setAddress(address);
        
        DAO dao = new DAO();

        int row = dao.update(vo);

        if (row > 0 ) { 
      
        	sessionVO.setPw(pw);
        	sessionVO.setTel(tel);
        	sessionVO.setAddress(address);
        }

        return "redirect:/Gomain.do";
		
	}
}

