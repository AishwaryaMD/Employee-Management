
<%@ page import="com.servlet.emp.dto.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@include file="Navbar.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   Employee emp =(Employee) session.getAttribute("Employee");
  
%>
<h1>Hello, <%= emp.getEname() %></h1>
<h1> Welcome to your Dashboard</h1>
</body>
</html> 
