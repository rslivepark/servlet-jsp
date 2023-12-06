package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.db.MessageDAO;

public class DelMessageAllService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		
		// DAO 접근(메세지 전부 지우는 용도)
		int cnt = new MessageDAO().deleteMessageAll(email);
	
		if(cnt>0) {
			System.out.println("전체 메시지 삭제 성공");
		} else {
			System.out.println("전체 메시지 삭제 실패");
			
		}
		
		return "redirect:/Gomain.do";
	}

}
