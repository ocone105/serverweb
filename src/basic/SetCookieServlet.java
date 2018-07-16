package basic;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 쿠키 설정하기
@WebServlet(name = "setCookie", urlPatterns = { "/setCookie" })
public class SetCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("setCookie");

		// 쿠키에 저장하고 싶은 데이터를 세팅해서 Cookie객체를 생성
		Cookie cookie1 = new Cookie("bookTitle", URLEncoder.encode("이클립스",  "euc-kr"));
		Cookie cookie2 = new Cookie("bookPage", "128");

		// 쿠키에 대한 유효시간을 설정 - 초단위
		cookie1.setMaxAge(60*60*24);	// {24시간 동안 유효}
		cookie2.setMaxAge(60*60*24);
		
		// response에 쿠키를 저장
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.sendRedirect("/serverweb/servlettest/cookieStart.jsp");
	}
}
