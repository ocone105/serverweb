package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;

@WebServlet(name = "emp/update", urlPatterns = { "/emp/update.do" })
public class EmpUpdateServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		System.out.println("������û����");
		
		// 1. Client ��û���� ����
		String id = req.getParameter("id");
		String addr = req.getParameter("addr");
		String point = req.getParameter("point");
		String grade = req.getParameter("grade");
		
		// 2. �����Ͻ� �޼ҵ� ȣ��
		EmpDTO user = new EmpDTO(id, addr, grade, Integer.parseInt(point));
		EmpService service = new EmpServiceImpl();
		int result = service.update(user);
		
		// 3. ��û������ - forward
		String view = "";
		if(result>=1){
			view = "/serverweb/emp/list.do";
		}else{
			view = "/serverweb/emp/read.do?id="+id+"&action=UPDATE";
		}

		res.sendRedirect(view);
		
		// RequestDispatcher rd = req.getRequestDispatcher("/emp/emp_read.jsp");
		// rd.forward(req, res);
	}
}