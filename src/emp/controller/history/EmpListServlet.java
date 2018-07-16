package emp.controller.history;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;

public class EmpListServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();

		// 2. �����Ͻ� �޼ҵ� ȣ��
		EmpService service = new EmpServiceImpl();
		ArrayList<EmpDTO> userlist = service.getMemberList();
		
		// 3. ����ȭ�� ����
		int size = userlist.size();
		System.out.println("����=>"+size);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>������</h1>");
		out.println("<hr/>");
		out.println("<table border='1'>");
		out.println("<tr bgColor='#e8f2fe'><th>�μ��ڵ�</th><th>����</th><th>���</th><th>�н�����</th><th>�ּ�</th><th>�Ի���</th><th>���</th><th>����Ʈ</th><th>����</th></tr>");
		for (int i = 0; i < size; i++) {
			EmpDTO user = userlist.get(i);
			out.println("<tr align='center'><td>"+user.getDeptno()+"</td>");
			out.println("<td>"+user.getName()+"</td>");
			out.println("<td>"+user.getId()+"</td>");
			out.println("<td>"+user.getPass()+"</td>");
			out.println("<td>"+user.getAddr()+"</td>");
			out.println("<td>"+user.getHiredate()+"</td>");
			out.println("<td>"+user.getGrade()+"</td>");
			out.println("<td>"+user.getPoint()+"</td>");
			out.println("<td><a href='/serverweb/emp/delete.do?info=test&id="+user.getId()+"'>����</a></td></tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}