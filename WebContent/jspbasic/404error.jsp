<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 오류 상황에 현재 페이지를 응답해서 결과로 출력해야 하므로 200코드를 설정해서 정상상황을 셋팅
	response.setStatus(HttpServletResponse.SC_OK);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
	<h2>요청된 파일을 찾을 수 없습니다. 다시 확인하세요.</h2>
</body>
</html>