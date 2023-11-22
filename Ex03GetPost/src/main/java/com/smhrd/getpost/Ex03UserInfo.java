package com.smhrd.getpost;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class Ex03UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public Ex03UserInfo() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		
		for(String x : hobbys) {
			System.out.println(x);			
		}
		
		System.out.println(job);
		System.out.println(gender);
		
	}

}
