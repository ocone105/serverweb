package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
				
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String[] language = req.getParameterValues("language");
		String save = req.getParameter("save");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 align= 'center'>client data</h2>");
		out.println("<hr/>");
		
		out.println("<ul>");
		out.println("<li>�̸� : ");
		if(name.equals("")){
			out.println("<�̸��� �Է��ϼ���><br/>");
		}else{
			out.println(name+"<br/>");
		}
		
		out.println("�ּ� : ");
		if(addr.equals("")){
			out.println("<�ּҸ� �Է��ϼ���><br/>");
		}else{
			out.println(addr);			
		}

		out.println("��밡���� Language ����.<br/>");
		if(language==null){
			out.println("<��밡���� language�� �����ϴ�.><br/>");
		}else{
			for(int i=0;i<language.length;i++){
				out.println(language[i]);
				out.println("<br/>");
			}
		}
		out.println("�Է� ���� �������� : ");
		if(save==null){
			out.println("�Է� ���� ���������� ���� �ϼ���");
		}else{
			out.println(save);
		}
		
		out.println("</body>");
		out.println("</html>");
	}
}
