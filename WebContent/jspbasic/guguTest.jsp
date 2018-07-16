<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<table border='1'>
	<% for(int dan=2;dan<=9;dan++){ %>
	<tr>
	<%for(int i=1;i<=9;i++){
		if(dan==i){  %>
		<td bgcolor=yellow>
		<% } else{ %>
		<td>
		<% } %> 
		<%=dan+"*"+i+"="+(dan*i)%>
		</td>
		<% } %>
		</tr>
		<% } %>
		</table>
				
</body>
</html>