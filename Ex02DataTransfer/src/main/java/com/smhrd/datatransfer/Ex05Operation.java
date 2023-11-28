package com.smhrd.datatransfer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex05Operation")
public class Ex05Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Ex05Operation() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int result;
		
		PrintWriter out = response.getWriter();

		String[] op = request.getParameterValues("operator");
		String[] opArr = { "plus", "minus", "multiply", "divide" };

		try {
			for (int i = 0; i < opArr.length; i++) {
				if (op[i].equals("plus")) {
					result = num1 + num2;
					out.printf("%d+%d=%d", num1, num2, result);
				} else if (op[i].equals("minus")) {
					result = num1 - num2;
					out.printf("%d-%d=%d", num1, num2, result);
				} else if (op[i].equals("multiply")) {
					result = num1 * num2;
					out.printf("%d*%d=%d", num1, num2, result);
				} else if (op[i].equals("divide")) {
					if (num1 != 0 || num2 != 0) {
						result = num1 / num2;
						out.printf("%d/%d=%d", num1, num2, result);
					} else {

					}
				}
			} // for
		} catch (ArithmeticException e) {
			e.printStackTrace();
			out.print("0으로 나눌 수 없습니다.");
		}//try-catch
		
		out.close();

	}

}
