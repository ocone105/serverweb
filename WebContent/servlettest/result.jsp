<%@page import="emp.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h2>��û���������� ���û�Ǿ� ����Ǵ� JSP���� - ������ �������� ������ ������ ���</h2>
	<hr/>
	<%
		// ������ �������� �����͸� ������ 
		EmpDTO data = (EmpDTO) request.getAttribute("mydata");	// {������ �����ʹ� object������ ���ϴ� Ÿ������ ĳ�����������}
	%>
	<h3>������ ����ڸ� : <%= data.getName() %></h3>
</body>
</html>