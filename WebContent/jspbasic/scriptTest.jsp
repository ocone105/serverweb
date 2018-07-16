<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="emp.dto.EmpDTO, java.util.Random, java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h3>4. 선언문 - jsp문서에서 멤버변수, 멤버메소드를 정의하기 위해서 사용(거의 사용하지 않는다.)</h3>
	<% int num = 1000; %>
	<%! int num = 100; %>
	<%! public void test(){
			System.out.print("test");
		}
	%>
	<h3>3. 표현식 - jsp가 서블릿으로 변환될 때 out.print()내부에 생성되는 코드</h3>
	<h4>==> 표현식으로 정의하는 데이터는 out.print()의 매개변수로 전달된다.
		따라서 표현식으로 정의할 때는 ;을 추가하지 않는다. ;을 추가하는 것은 print(값;)와 동일한 결과가 된다.
		표현식은 자바에서 실행되는 값을 웹페이지에 출력할 목적으로 사용되는 jsp스크립트 요소이며 사용가능한 타입은 제한적이다.
		타입이 제한적인 이유는 서블릿으로 변환될 때 print메소드의 매개변수로 전달되므로 기본형, 스트링으로 변환될 수 있는 값,
		메소드의 호출결과 연산식 등을 사용할 수 있다. 
	</h4>
	<% String mydata = "java programming"; %>
	<h3>표현식으로 작성하는 문자열의 길이:<%= mydata.length() %></h3>
	<h5><%=10 %></h5>
	<h5><%=10.5 %></h5>
	<h5><%="java" %></h5>
	<h5><%=10/4 %></h5>
	<h5><%=new Date().toString() %></h5>
	<h5><%=mydata %></h5>
	<h5><%=mydata.charAt(1) %></h5>
	
	<h3>2. 스크립트릿 - 자바코드를 쓸 수 있는 스크립트 요소</h3>
	<%
		// 자바 명령문을 정의할 수 있는 곳 ;을 문장의 끝에 추가해야 한다.
		// 기본으로 인식하는 패키지는 java.lang패키지 밖에 없다. 다른 패키지를 사용하는 경우 import해야 한다. 
		// jsp에서 자동으로 만들어 지는 지역변수를 사용할 수 있다.
		String str = new String("자바");
		out.println("<h3>문자열의 길이"+str.length()+"</h3>");
		Random rand = null;
		ArrayList list = null;
		StringTokenizer st = null;
		EmpDTO user = null;
	%>
	<h3>1. 주석문</h3>
	<!-- html주석문(클라이언트로 전송) -->
	<%-- jsp주석문(jsp코드를 주석으로 처리하는 용도 : 클라이언트에 전송되지 않는다. --%>
	<%
		// 자바주석문
		/*
			자바 여러줄 주석문
		*/
	%>
</body>
</html>