

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex08_loginCheck")
public class Ex08_loginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ex08_loginCheck() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 객체를 요청하는 경우 getAttribute, setAttribute 이용
		
		if(id.equals("test") && pw.equals("12345")) {
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			
			//forward드 보다는 sendRedirect가 더 적합함
			response.sendRedirect("Ex08_main.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("Ex08_main.jsp"); // 
			//rd.forward(request, response);
		} else  {
			response.sendRedirect("Ex08_login.html");
		}
	
	}

}
