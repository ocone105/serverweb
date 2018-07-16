package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		// ó���� ���� �⺻ �۾� - �ѱۼ���, ���䰴ü�κ��� ��Ʈ���� ���, ���信 ���� Ÿ�� ����
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		// ��û��������
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String opr = req.getParameter("method");
		
		// �����Ͻ����� ȣ��
		Calc obj = new Calc();
		int result=	obj.calc(num1, num2, opr);
		
		// Client�� ������ ȭ���� ����
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>�����("+opr+"��������)</h1>");
		out.println("<hr/>");
		out.println("<h1>num1�� "+num1+"�� num2�� "+num2+"�� ������ ����� "+result+"�Դϴ�.</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}