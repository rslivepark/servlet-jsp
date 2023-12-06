package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.db.DAO;

public class EmailCheckService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Email Check");

		String inputE = request.getParameter("inputE");
		System.out.println(inputE);

		boolean checkE = new DAO().emailCheck(inputE);
		PrintWriter out;

		try {
			out = response.getWriter();
			out.print(checkE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
