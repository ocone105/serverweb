<%@page import="java.net.URLDecoder"%>
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
		String bookTitle = (String) request.getAttribute("bookTitle");
		String bookPage = (String) request.getAttribute("bookPage");
	%>
	<h2>최근에 보신 책의 제목은 <%= URLDecoder.decode(bookTitle, "euc-kr") %>이며 <%=bookPage %>까지 읽었습니다.</h2>
</body>
</html>