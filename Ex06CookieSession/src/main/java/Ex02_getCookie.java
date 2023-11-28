

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02_getCookie")
public class Ex02_getCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex02_getCookie() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();
		
		for(Cookie c : cookies) {
			out.print(c.getName() + " : " + c.getValue() + "<br>");
		}//for
	}

}
