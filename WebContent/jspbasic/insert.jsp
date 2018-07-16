<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="emp.service.EmpService, emp.service.EmpServiceImpl, emp.dto.EmpDTO"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		String deptno = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		String point = request.getParameter("point");
		String grade = request.getParameter("grade");
		
		EmpService service = new EmpServiceImpl();
		EmpDTO user = new EmpDTO(id, pass, name, addr, grade, Integer.parseInt(point), deptno);
		int result = service.insert(user);
		String msg = "";
		if(result>=1){
			msg = result + "개 행 삽입 성공";
		}else{
			msg = "삽입실패";
		}
	%>
	<h3><%=msg %></h3>
	
</body>
</html>