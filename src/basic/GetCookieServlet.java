package basic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 쿠키 가져오기
@WebServlet(name = "getCookie", urlPatterns = { "/getCookie" })
public class GetCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("getCookie");
		
		// request객체에서 쿠키를 꺼낸다.
		Cookie[] cookies = request.getCookies();
		
		// 쿠키에 저장된 value를 보관한 변수
		String bookTitle = "";
		String bookPage = "";
		
		// 쿠키에 저장된 value 꺼내기
		for (int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals("bookTitle")){
				bookTitle = cookies[i].getValue();
			}else if(cookies[i].getName().equals("bookPage")){
				bookPage = cookies[i].getValue();
			}
		}
		
		// 꺼낸 쿠키를 공유
		request.setAttribute("bookTitle", bookTitle);
		request.setAttribute("bookPage", bookPage);

		// 요청재지정
		RequestDispatcher rd = request.getRequestDispatcher("/servlettest/cookieResult.jsp");
		rd.forward(request, response);
	}
}
