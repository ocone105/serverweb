<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="error.jsp"%>
<!-- errorPage에 error가 발생했을 때 보여질 페이지의 path를 정의
	 XXXException(실행오류 - 500응답코드)이나 응답 오류가 발생했을 때 error.jsp를 대신 응답하겠다는 의미-->
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<!-- 에러를 발생시키고 테스트 하는 jsp -->
	<% String str = null; %>
	<%= str.length() %>
</body>
</html>