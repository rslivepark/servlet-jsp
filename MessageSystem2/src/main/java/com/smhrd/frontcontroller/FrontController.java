package com.smhrd.frontcontroller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.controller.Command;
import com.smhrd.controller.DelMessageAllService;
import com.smhrd.controller.EmailCheckService;
import com.smhrd.controller.JoinService;
import com.smhrd.controller.LoginService;
import com.smhrd.controller.LogoutService;
import com.smhrd.controller.SelectAllService;
import com.smhrd.controller.UpdateService;

/* 확장자 패턴
 * 요청 url이 .do로 끝나면 해당하는 요청을 전부 처리해주도록 설정 
*/
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * HashMap<K, V> 변수명; - hashmap은 key 값을 불러와 values 사용한다 - if문 보다 속도 빠름. hashmap
	 * 연산하는게 아님 - 가독성 굿!
	 */

	HashMap<String, Command> map = new HashMap<>();

	@Override
	public void init() throws ServletException {

		super.init();
		map.put("Join.do", new JoinService());
		map.put("Login.do", new LoginService());
		map.put("Logout.do", new LogoutService());
		map.put("SelectAll.do", new SelectAllService());
		map.put("Update.do", new UpdateService());
		map.put("EmailCheckService.do", new EmailCheckService());
		map.put("DelMessageAllService.do", new DelMessageAllService());

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 요청 url을 잘라오는 방법
		// 1) uri 가져오기

		String uri = request.getRequestURI();
		System.out.println("가져온 uri >> " + uri);

		// 2) context path 가져오는 방법
		String cp = request.getContextPath();
		System.out.println("가져온 cp >> " + cp);

		// 3) uri cp 잘라내기
		String path = uri.substring(cp.length() + 1);
		System.out.println("잘라낸 path >> " + path);

		request.setCharacterEncoding("utf-8");

		String finalPath = null;
		Command com = null;

		// 3. path값이 어떤 요청이냐에 따라서 다른 기능 수행
		if (path.contains("Go")) {
			// Go + 파일이름 + .do

			finalPath = path.replaceAll("Go", "").replaceAll(".do", ".jsp");

		} else {
//			if (path.equals("Join.do")) {
//
//				// 4. 일반 클래스파일에게 일을 시키는 작업을 진행
//				com = new JoinService();
//
//			} else if (path.equals("Login.do")) {
//				com = new LoginService();
//
//			} else if (path.equals("Logout.do")) {
//				com = new LogoutService();
//
//			} else if (path.equals("SelectAll.do")) {
//				com = new SelectAllService();
//
//			} else if (path.equals("Update.do")) {
//				com = new UpdateService();
//
//			} // if -2 끝

			com = map.get(path);

			finalPath = com.execute(request, response);

			//

		} // if-1 끝

		// 5. 페이지 이동 (2가지 -> forward, redirect)

		if (finalPath != null) {

			if (finalPath.contains("redirect:/")) {
				response.sendRedirect(finalPath.substring(10));
				// response.sendRedirect(fianlPath.replaceAll(("redirect:/", ""));
				// 편한거 아무거나 사용해서 파싱해도 ㄱㅊ

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/" + finalPath);
				rd.forward(request, response);
			} // 연결방식if 끝
			
		}//if-1
		
	}// service()
}
