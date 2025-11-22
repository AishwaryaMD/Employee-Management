<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar</title>

<style>
    body{
        margin:0;
        font-family:Arial, sans-serif;
        background:#f4f4f4;
    }
    .navbar{
        background:powderblue;
        padding:15px;
        display:flex;
        gap:30px;
        align-items:center;
        box-shadow:0 2px 6px rgba(0,0,0,0.2);
    }
    .navbar a{
        color:#000;
        text-decoration:none;
        font-size:18px;
        font-weight:bold;
        padding:8px 14px;
        border-radius:6px;
        transition:0.3s;
    }
    .navbar a:hover{
        background:#007bff;
        color:#fff;
    }
    .navbar a.active{
        background:#007bff;
        color:white;
    }
</style>

</head>
<body>

	<div class="navbar">
	    <a href="index.jsp" class="active">Home</a>
	    <a href="Register.jsp">Register</a>
	    <a href="Login.jsp">Login</a>
	    <a href="Dashboard.jsp">Dashboard</a>
	    <a href="View">View Employees</a>
	    <a href="Logout">Logout</a>
	</div>

</body>
</html>
