<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.spring.example.dto.FruitDTO" %>
<%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	fruits<br>
	
	<%
		List<FruitDTO> fruits = (List<FruitDTO>)request.getAttribute("fruits");
		for(int i = 0; i < fruits.size() ; i++){
	%>
		<%= fruits.get(i).getName() %>
	<%
		}
	%>
</body>
</html>