<%@page import="emp.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>������</h1>
	<hr/>
	<%
		ArrayList<EmpDTO> userlist = (ArrayList<EmpDTO>) request.getAttribute("userlist");
		EmpDTO loginUser = (EmpDTO) request.getAttribute("loginUser");
	%>
	<%
		if(loginUser==null){
		response.sendRedirect("/serverweb/emp/login.jsp");
		}else{
	%>
	<h4><%= loginUser.getName() %>��</h4>
	<jsp:include page="/emp/search.jsp">
		<jsp:param value="" name="column"/>	
		<jsp:param value="" name="search"/>
	</jsp:include>
	
	<table border="1">
		<tr bgColor="#e8f2fe">
			<th>���</th>
			<th>����</th>
			<th>�μ��ڵ�</th>
			<th>�н�����</th>
			<th>�ּ�</th>
			<th>�Ի���</th>
			<th>���</th>
			<th>����Ʈ</th>
			<th>����</th>
		</tr>
		<%
		int size = userlist.size();
		for (int i = 0; i < size; i++) {
			EmpDTO user = userlist.get(i);
		%>
		<tr align="center">
			<td><a href="/serverweb/emp/read.do?id=<%=user.getId()%>&action=READ"><%=user.getId()%></a></td>
			<td><%=user.getName()%></td>
			<td><%=user.getDeptno()%></td>
			<td><%=user.getPass()%></td>
			<td><%=user.getAddr()%></td>
			<td><%=user.getHiredate()%></td>
			<td><%=user.getGrade()%></td>
			<td><%=user.getPoint()%></td>
			<td><a href="/serverweb/emp/delete.do?id=<%=user.getId()%>">����</a></td>
		</tr>
		<%} %>
	</table>
	<%
		}
	%>
</body>
</html>