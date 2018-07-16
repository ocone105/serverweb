<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] item = request.getParameterValues("item");
	%>
	<h1>Customer</h1>
	<hr/>
	<h1>ID : <%=userId %></h1>
	<h1>name : <%=userName %></h1>
	<h1>password : <%=passwd %></h1>
	<h1>gender : <%=gender %></h1>
	<h1>job : <%=job %></h1>
	<h1>favorite : 
	<% 		
		for(int i=0;i<item.length;i++){
	%>
	<%= item[i] %>
	<%} %></h1>
</body>
</html>