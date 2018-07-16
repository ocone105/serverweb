<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2> 사원 검색 </h2>
	<form method = "get" action = "/serverweb/emp/search.do">
		<select name="column">
			<option>검색을 항목 선택
			<option value="id">아이디
			<option value="name">성명
			<option value="addr">주소
		</select>
		<input type = "text" name = "search"/>
		<!-- <input type = "text" name = "pass"/> -->
		<input type='submit' value='검색'> 
	</form>
</body>
</html>