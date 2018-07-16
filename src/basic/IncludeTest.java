package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;

@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class IncludeTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		System.out.println("include���� - include������ ������");
		out.println("<h1>��û������ ���� - include</h1>");
		
		// 1. ������ ���� - db���� ������ ����� �����Ͻ����� ������
		EmpDTO dto = new EmpDTO("jang", "", "�嵿��", "", "", 0, "11");
		// ��û�����ȿ��� "mydata"��� �̸����� dto�� ������ �� �ֵ��� �����۾�
		request.setAttribute("mydata", dto);
		
		// 2. ��û������ - include
		RequestDispatcher rd = request.getRequestDispatcher("/servlettest/result.jsp");
		rd.include(request, response);
		
		out.print("<h2>��û������ ����-include end</h2>");
	}
}