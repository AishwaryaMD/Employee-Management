<%@page import="com.servlet.emp.dto.Employee" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    /* 🌸 Background Styles */
    body {
        font-family: "Poppins", sans-serif;
        background: #ffffff;
        margin: 0;
        overflow-x: hidden;
        position: relative;
    }

    /* Left bubble */
    body::before {
        content: "";
        position: absolute;
        top: -120px;
        left: -100px;
        width: 300px;
        height: 300px;
        background: #ffd4ee;
        opacity: 0.6;
        border-radius: 50%;
        z-index: -1;
    }

    /* Right bubble */
    body::after {
        content: "";
        position: absolute;
        bottom: -100px;
        right: -110px;
        width: 350px;
        height: 350px;
        background: #e4c9ff;
        opacity: 0.6;
        border-radius: 50%;
        z-index: -1;
    }

    /* 🌸 Center Table Card */
    .table-container {
        width: 80%;
        margin: 120px auto;
        background: #fff;
        padding: 25px;
        border-radius: 20px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.12);
    }

    table {
        width: 100%;
        border-collapse: collapse;
        border-radius: 12px;
        overflow: hidden;
    }

    th {
        background-color: #ffb6d9;
        padding: 12px;
        font-size: 16px;
        color: #fff;
    }

    td {
        text-align: center;
        padding: 10px;
        background: #fff;
        border-bottom: 1px solid #e5c9ff;
    }

    tr:hover {
        background-color: #faeaff;
    }

    /* 🌈 Buttons */
    a.edit-btn, a.delete-btn {
        padding: 6px 12px;
        border-radius: 8px;
        text-decoration: none;
        color: white;
        font-size: 14px;
        font-weight: 500;
        transition: 0.3s;
        margin: 2px;
        display: inline-block;
    }

    .edit-btn {
        background: #b56bff;
    }
    .edit-btn:hover {
        background: #8a39f0;
    }

    .delete-btn {
        background: #ff70a6;
    }
    .delete-btn:hover {
        background: #e6497c;
    }
</style>

</head>
<body>

<%
     List<Employee> elist=(List<Employee>)request.getAttribute("emplist");
%>

<table border="1">

<tr>
   <th>Employee Id</th>
   <th>Employee Name</th>
   <th>Department</th>
   <th>Salary</th>
   <th>Phone</th>
   <th>Email</th>
</tr>

   <% for(Employee emp:elist)
   {
   %>
   <tr>
   <td><%= emp.getEmpid() %></td>
   <td><%=emp.getEname()%></td>
   <td><%=emp.getDept() %></td>
   <td><%=emp.getSalary() %></td>
   <td><%=emp.getPhone() %></td>
   <td><%=emp.getEmail() %></td>
   <td>
   <a href="EditForm?empid=<%= emp.getEmpid()%>">Edit</a>
   <a href="Delete?empid=<%= emp.getEmpid() %>">Delete</a>
   </td>
   </tr> 
   <%} %>


</table>

</body>
</html>