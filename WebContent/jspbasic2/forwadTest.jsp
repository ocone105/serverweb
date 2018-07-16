<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>forward테스트</h1>
	<hr/>
	<h2>forward는 요청재지정에서 살펴본 RequestDispatcher의 forward와 동일하게 동작한다.
		forward될 문서로 파라미터도 넘길 수 있다.</h2>
	<h2>/serverweb/list.do?id=jang처럼 요청하면서 파라미터 넘기는 것과 동일한 작업이라 생각</h2>
	
	<jsp:forward page="/jspbasic2/actiontag_sub.jsp">
		<jsp:param value="jang" name="id"/>	
	</jsp:forward>
	
	<h1>==========forward액션태그 테스트==========</h1>
</body>
</html>