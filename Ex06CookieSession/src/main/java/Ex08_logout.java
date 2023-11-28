

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex08_logout")
public class Ex08_logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Ex08_logout() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session =  request.getSession();
		session.removeAttribute("id");
		session.removeAttribute("pw");
		
		
		response.sendRedirect("Ex08_login.html");
		//RequestDispatcher rd = request.getRequestDispatcher("Ex08_login.html"); // 
		//rd.forward(request, response);
	}

}
