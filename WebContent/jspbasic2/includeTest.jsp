<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>include테스트</h1>
	<hr/>
	<h2>include액션태그는 요청재지정되는 web application의 실행결과를 가지고 되돌아온다.</h2>
		
	<jsp:include page="/jspbasic2/actiontag_sub.jsp">
		<jsp:param value="kim" name="id"/>	
	</jsp:include>
	
	<h1>==========include액션태그 테스트==========</h1>
</body>
</html>