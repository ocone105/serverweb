package basic;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "cart", urlPatterns = { "/cart.do" })
public class ShoppingCart extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		String productName = request.getParameter("item");
		//System.out.println(productName);
		
		// 세션객체생성
		HttpSession ses = request.getSession();
		Integer count = (Integer)ses.getAttribute(productName);	// {오토언박싱?}
		
		// item에 해당하는 attribute가 없으면 null을 리턴
		if(count==null){	// 최초 선택
			ses.setAttribute(productName, 1);
		}else{
			// 최초 작업이 아니므로 value에 1만 더해서 다시 저장
			ses.setAttribute(productName, count+1);
		}
		
		// 세션에 데이터 공유
		// ses.setAttribute(item, 1);
		
		RequestDispatcher rd = request.getRequestDispatcher("/servlettest/cart.jsp");
		rd.forward(request, response);
	}
}
