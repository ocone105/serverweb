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
	<h2>요청재지정으로 재요청되어 실행되는 JSP문서 - 서블릿이 공유해준 데이터 꺼내서 출력</h2>
	<hr/>
	<%
		// 서블릿이 공유해준 데이터를 꺼내서 
		EmpDTO data = (EmpDTO) request.getAttribute("mydata");	// {꺼내온 데이터는 object임으로 원하는 타입으로 캐스팅해줘야함}
	%>
	<h3>공유된 사용자명 : <%= data.getName() %></h3>
</body>
</html>