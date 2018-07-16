<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<%	
		// request에 저장된 데이터를 꺼내서 출력 
		// String mydata = (String) request.getAttribute("mydata");
	
		// jsp문서에서 세션을 사용하는 방법 - jsp는 기본으로 세션객체를 제공한다. - 내장객체
		String mydata = (String) session.getAttribute("mydata");
	%>
	<h2>꺼낸 데이터 : <%=mydata %></h2>
	<hr/>
	<h3><a href="/serverweb/servlettest/ses_second.jsp">데이터가 공유될까요?</a></h3>
</body>
</html>