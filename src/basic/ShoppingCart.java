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
		
		// ���ǰ�ü����
		HttpSession ses = request.getSession();
		Integer count = (Integer)ses.getAttribute(productName);	// {�����ڽ�?}
		
		// item�� �ش��ϴ� attribute�� ������ null�� ����
		if(count==null){	// ���� ����
			ses.setAttribute(productName, 1);
		}else{
			// ���� �۾��� �ƴϹǷ� value�� 1�� ���ؼ� �ٽ� ����
			ses.setAttribute(productName, count+1);
		}
		
		// ���ǿ� ������ ����
		// ses.setAttribute(item, 1);
		
		RequestDispatcher rd = request.getRequestDispatcher("/servlettest/cart.jsp");
		rd.forward(request, response);
	}
}
