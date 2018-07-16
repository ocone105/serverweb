package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;

@WebServlet(name = "redirect", urlPatterns = { "/redirect.do" })
public class SendRedirectTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html);charset-euc-kr");
		PrintWriter out = response.getWriter();
		
		System.out.println("sendRedirect연습 - Redirect서블릿 실행중");
		out.println("<h1>요청재지정 연습 - sendRedirect</h1>");
		
		// 1. 데이터 공유 - db에서 가져온 결과나 비지니스로직 수행결과
		EmpDTO dto = new EmpDTO("jang", "", "장동건", "", "", 0, "11");
		// 요청범위안에서 "mydata"라는 이름으로 dto가 공유될 수 있도록 공유작업
		request.setAttribute("mydata", dto);
		
		// 2. 요청재지정 - sendRedirect
		response.sendRedirect("/serverweb/servlettest/result.jsp");
	}
}
