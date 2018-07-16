package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		System.out.println("서블릿요청성공");
		/*
		 	이부분 없어도 됨
		  	res.setContentType("text/html;charset=euc-kr");
			PrintWriter out = res.getWriter();
		*/
				
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
		
		// 3. 데이터 공유
		String msg = "";
		if(result>=1){
			msg = result + "개 행 삽입 성공";
		}else{
			msg = "삽입실패";
		}
	
		req.setAttribute("msg", msg);
		
		// 4. 요청재지정 - forward
		// res.sendRedirect("/serverweb/basic/insertResult.html");
		
		RequestDispatcher rd = req.getRequestDispatcher("/emp/insertResult.jsp");
		rd.forward(req, res);
	}
}