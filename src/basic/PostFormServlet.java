package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
				
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] item = req.getParameterValues("item");
		
		// Client에 응답한 화면을 생성
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Customet</h1>");
		out.println("<hr/>");
		out.println("<h1>ID:"+userId+"</h1>");
		out.println("<h1>name:"+userName+"</h1>");
		out.println("<h1>password:"+passwd+"</h1>");
		out.println("<h1>gender:"+gender+"</h1>");
		out.println("<h1>job:"+job+"</h1>");
		out.println("<h1>favorite:");
		for(int i=0;i<item.length;i++){
			out.println(item[i]+" ");
		}
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}