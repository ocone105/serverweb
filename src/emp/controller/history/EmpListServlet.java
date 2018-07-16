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

		// 2. 비지니스 메소드 호출
		EmpService service = new EmpServiceImpl();
		ArrayList<EmpDTO> userlist = service.getMemberList();
		
		// 3. 응답화면 생성
		int size = userlist.size();
		System.out.println("서블릿=>"+size);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>사원목록</h1>");
		out.println("<hr/>");
		out.println("<table border='1'>");
		out.println("<tr bgColor='#e8f2fe'><th>부서코드</th><th>성명</th><th>사번</th><th>패스워드</th><th>주소</th><th>입사입</th><th>등급</th><th>포인트</th><th>삭제</th></tr>");
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
			out.println("<td><a href='/serverweb/emp/delete.do?info=test&id="+user.getId()+"'>삭제</a></td></tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}