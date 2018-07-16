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
		System.out.println("서블릿요청성공");
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		// 1. 요청정보 추출
		String id = req.getParameter("id");
		
		// 2. 비지니스 메소드 호출
		EmpService service = new EmpServiceImpl();
		int result = service.delete(id);
		
		// 3. 응답화면생성
		String msg = "";
		if(result<0){
			msg = "삭제실패";
		}else{
			msg = result + "개행 삭제성공";
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 align= 'center'>결과</h2>");
		out.println("<hr/>");
		out.println("<h1>"+msg+"</h1>");		
		out.println("<a href='/serverweb/emp/list.do'>회원목록보기</a>");
		out.println("</body>");
		out.println("</html>");
	}
}