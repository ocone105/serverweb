<%@page import="java.util.Enumeration"%>
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
	<form method="post" action="/serverweb/cart.do">
		항목선택 <br /> <select name="item">
			<option value="냉장고">냉장고
			<option value="세탁기">세탁기
			<option value="TV">TV
			<option value="김치냉장고">김치냉장고
			<option value="전자레인지">전자레인지
		</select> <input type="submit" value="장바구니">
	</form>
	<hr />
	
	<%
		Enumeration<String> attrNames = session.getAttributeNames();
		while(attrNames.hasMoreElements()){
			String attrName = attrNames.nextElement();
			int attrVal = (Integer) session.getAttribute(attrName);
			System.out.println(attrName+" : "+attrVal);
	%>
	<h3><%=attrName %> : <%=attrVal %></h3>
	<%
		}
		System.out.println("------------------");
	%>
</body>
</html>


