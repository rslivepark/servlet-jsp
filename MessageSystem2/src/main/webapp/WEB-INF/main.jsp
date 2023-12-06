<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>JSP & Servlet 실습예제 </title>
		<meta charset="UTF-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header" class="alt">
						<a href="index.html" class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a>
						<nav>
							 <!-- 
							 <c:if test="${member.email eq 'admin'}">
								<a href="??">회원관리</a>
								<a href="Logout.do">로그아웃</a>							
							</c:if>
							  -->
									
							<c:if test="${member == null }">
								<a href="#menu">로그인</a>
							</c:if>
							
							<c:if test="${member != null }"> 
								
								<c:if test="${member.email != 'admin' }"> 
								<a href="Goupdate.do">개인정보 수정</a>
								</c:if>
								
								<c:if test="${member.email == 'admin' }"> 
								<a href="SelectAll.do">회원관리</a>
								</c:if>
								
								<a href="Logout.do">로그아웃</a> <!-- 서블릿 파일// 세션 모두 다 지워주는 방식 -->
							</c:if>

								
							<!-- 로그인 후 Logout.jsp로 이동할 수 있는'로그아웃'링크와 '개인정보수정'링크를 출력하시오. -->
						</nav>
					</header>

				<!-- Menu -->
					<nav id="menu">	
						<ul class="links">
							<li><h5>로그인</h5></li>
								<form action="Login.do" method="post">
									<li><input name="email" type="text"  placeholder="Email을 입력하세요"></li>
									<li><input name="pw" type="password"  placeholder="PW를 입력하세요"></li>
									<li><input type="submit" value="LogIn" class="button fit"></li>
								</form>
						</ul>
						<ul class="actions vertical">
							<li><h5>회원가입</h5></li>
								<form action="Join.do" method="post">
								<!-- name은 db table column 이름과 일치시킨다-->
									<li><input name="email"  id = "inputE" type="text"  placeholder="Email을 입력하세요"></li>
									<li><input type="button" id = "inputE" value="이메일 중복체크" onclick="checkE()"></li>
									<li><span id="resultCheck"></span></li>
									<li><input name="pw" type="password"  placeholder="PW를 입력하세요"></li>
									<li><input name="tel" type="text"  placeholder="전화번호를 입력하세요"></li>
									<li><input name="address" type="text"  placeholder="집주소를 입력하세요"></li>
									<li><input type="submit" value="JoinUs" class="button fit"></li>
								</form>
						</ul>
					</nav>			
				<!-- Banner -->
					<section id="banner" class="major">
						<div class="inner">
							<header class="major">
							
							<!--  로그인 성공시 화면 -->		
							<%  if(session.getAttribute("member") != null) {%>
								<h1>${member.email}님 환영합니다.</h1><br>
							<% } %>
							
							<!--  로그인 실패시 보여줄 화면 -->
							<!-- 
							JSTL 사용법 >> 접두사:사용할자바문법 
									attribute >> 속성을 기준으로 조건 지정
									el 문법 사용이 가능함 -->
							<c:if test="${member == null }">
								<h1>로그인 해주세요</h1>
							</c:if>
							
							
							</header>
							<div class="content">
								<p>아래는 지금까지 배운 웹 기술들입니다.<br></p>
								<ul class="actions">
									<li><a href="#one" class="button next scrolly">확인하기</a></li>
								</ul>
							</div>
						</div>
					</section>

				<!-- Main -->
					<div id="main">

						<!-- One -->
							<section id="one" class="tiles">
								<article>
									<span class="image">
										<img src="images/pic01.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">HTML</a></h3>
										<p>홈페이지를 만드는 기초 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic02.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">CSS</a></h3>
										<p>HTML을 디자인해주는 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic03.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Servlet/JSP</a></h3>
										<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic04.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">JavaScript</a></h3>
										<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic05.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">MVC</a></h3>
										<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic06.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Web Project</a></h3>
										<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>
									</header>
								</article>
							</section>
					<!-- Two -->
							<section id="two">
								<div class="inner">
									<header class="major">
										<h2>나에게 온 메세지 확인하기</h2>
									</header>
									<p></p>
									<ul class="actions">
										<!-- 로그인 이메일 출력하기 -->										
										<c:choose>
											<c:when test="${ member == null}">
												<li>로그인을 하세요.</li>
											</c:when>
											<c:otherwise>
												<li>${member.email}님에게 온 메세지</li>
												<!--  전체메세지 삭제 -->
												<li><a href="DelMessageAllService.do?email=${member.email}" class="button next scrolly">전체삭제하기</a></li>
																												
											</c:otherwise>
											
											
											
										</c:choose>
									</ul>
								</div>
							</section>

					</div>

				<!-- Contact -->
					<section id="contact">
						<div class="inner">
							<section>
								<form>
								<div class="field half first">
										<label for="name">Name</label>
										<input type="text"  id="name" placeholder="보내는 사람 이름" />
									</div>
									<div class="field half">
										<label for="email">Email</label>
										<input type="text"  id="email" placeholder="보낼 사람 이메일"/>
									</div>

									<div class="field">
										<label for="message">Message</label>
										<textarea  id="message" rows="6"></textarea>
									</div>
									<ul class="actions">
										<li><input type="submit" value="Send Message" class="special" /></li>
										<li><input type="reset" value="Clear" /></li>
									</ul>
								</form>
							</section>
							
							<section class="split">
								<section>
									<div class="contact-method">
										<span class="icon alt fa-envelope"></span>
										<h3>Email</h3>
										
											<a href="#">${member.email} </a>
											
										
												

										<!-- 로그인 한 사용자의 이메일을 출력하시오 -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-phone"></span>
										<h3>Phone</h3>
										<span>
										
										<a href="#">${member.tel} </a>
										
										
										</span>
										<!-- 로그인 한 사용자의 전화번호를 출력하시오 -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-home"></span>
										<h3>Address</h3>
										<span>
										<a href="#">${member.address}</a>
										</span>
										<!-- 로그인 한 사용자의 집주소를 출력하시오 -->
									</div>
								</section>
							</section>					
						</div>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<div class="inner">
							<ul class="icons">
								<li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
								<li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
								<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
								<li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
								<li><a href="#" class="icon alt fa-linkedin"><span class="label">LinkedIn</span></a></li>
							</ul>
							<ul class="copyright">
								<li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>
			
			
			<script type="text/javascript">
				function checkE() {
					 var inputE = $("#inputE").val();					 
					 console.log(inputE);
					 
					 $.ajax({
						 // 어디로 요청할것인가?
								 url : 'EmailCheckService.do',
						// 요청할 데이터(json(key:value형태))
						 data : {'inputE': inputE},
						
						//요청방식 (get, post)
						type: 'get',
						
						// 요청이 성공할 경우 무엇을 할지?
						success : function(data) {
							if(data == 'true') {
								$('#resultCheck').text('사용할 수 없는 아이디');
							} else if(data == 'false') {
								$('#resultCheck').text('사용할 수 있는 아이디');
							}
							
						}, error : function() {
							alert("통신실패");
							
						}//success - error
						 
					 }); //ajax
					 
				}			
			</script>

	</body>
</html>

