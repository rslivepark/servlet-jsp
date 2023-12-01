package com.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.smhrd.db.DAO;
import com.smhrd.model.MemberVO;

public class SelectAllService  implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DAO dao = new DAO();

		List<MemberVO> resultList = dao.selectAll();
		request.setAttribute("list", resultList); 		
		
		return "select.jsp";
	
	}

}
