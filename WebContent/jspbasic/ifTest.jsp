<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<%String str = "java";
		int size = str.length();
	%>
	<h1>스크립트 요소(스크립트릿과 표현식을 같이 사용)</h1>
	<%if(size>=5){ %>
		<h1>좋아요:<%=size %></h1>
	<%}else{ %>
		<h1>싫어요:<%=size %></h1>
	<%} %>
</body>
</html>