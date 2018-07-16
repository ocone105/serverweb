<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>
<!-- 에러가 발생했을 때 보여질 페이지 
	 에러가 발생했을 때 보여지는 페이지로 정의하려면 isErrorPage속성을 true로 지정해야 한다.
	 에러 전용페이지로 인식
-->
<%
	// 에러가 발생한 경우 다른 페이지가 응답될 수 없다. - 이미 오류상태인 응답코드가 설정되었으므로 
	// error페이지가 정상적으로 응답될 수 있도록 하려면 응답코드를 정상상태로 세팅해주어야 한다.
	// 응답페이지에 200번 코드를 설정
	response.setStatus(200);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<img alt="" src="/serverweb/images/jang.jpg"/>
	<hr/>
	<h3>현재 서버 작업 중입니다.</h3>
	<h3>11:00 ~ 12:00</h3>
</body>
</html>