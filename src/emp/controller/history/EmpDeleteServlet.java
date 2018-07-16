package emp.controller.history;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;

public class EmpDeleteServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("������û����");
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		// 1. ��û���� ����
		String id = req.getParameter("id");
		
		// 2. �����Ͻ� �޼ҵ� ȣ��
		EmpService service = new EmpServiceImpl();
		int result = service.delete(id);
		
		// 3. ����ȭ�����
		String msg = "";
		if(result<0){
			msg = "��������";
		}else{
			msg = result + "���� ��������";
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 align= 'center'>���</h2>");
		out.println("<hr/>");
		out.println("<h1>"+msg+"</h1>");		
		out.println("<a href='/serverweb/emp/list.do'>ȸ����Ϻ���</a>");
		out.println("</body>");
		out.println("</html>");
	}
}