package emp.controller.history;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;

public class EmpInsertServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
				
		String deptno = req.getParameter("deptno");
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String addr = req.getParameter("addr");
		String point = req.getParameter("point");
		String grade = req.getParameter("grade");
		
		// 2. 비지니스 메소드 호출
		EmpService service = new EmpServiceImpl();
		EmpDTO user = new EmpDTO(id, pass, name, addr, grade, Integer.parseInt(point), deptno);
		int result = service.insert(user);
		String msg = "";
		if(result>=1){
			msg = result + "개 행 삽입 성공";
		}else{
			msg = "삽입실패";
		}
		
		// 3. 응답화면을 생성
		out.println("<html>");
		out.println("<body>");
		out.println(msg+"</br>");
		out.println("<a href='/serverweb/emp/list.do'>회원목록보기</a>");
		out.println("</body>");
		out.println("</html>");
	}
}