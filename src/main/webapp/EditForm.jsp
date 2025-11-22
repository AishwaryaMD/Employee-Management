<%@page import="com.servlet.emp.dto.Employee"%>
<%
Employee emp = (Employee) request.getAttribute("employee");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>

<style>
    body {
        font-family: "Poppins", Arial;
        background: #ffffff;
        height: 100vh;
        margin: 0;
        overflow-x: hidden;
        display: flex;
        justify-content: center;
        align-items: center;
        position: relative;
    }

    /* Background bubbles */
    body::before {
        content: "";
        position: absolute;
        top: -80px;
        left: -100px;
        width: 280px;
        height: 280px;
        background: #ffdaf1;
        opacity: 0.7;
        border-radius: 50%;
    }

    body::after {
        content: "";
        position: absolute;
        bottom: -90px;
        right: -110px;
        width: 330px;
        height: 330px;
        background: #e3c5ff;
        opacity: 0.7;
        border-radius: 50%;
    }

    /* Form container */
    .edit-box {
        background: #ffffff;
        width: 420px;
        padding: 30px;
        border-radius: 20px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.12);
        z-index: 10;
        animation: fadeIn 0.9s ease-in-out;
        text-align: center;
    }

    h2 {
        color: #a835ff;
        font-weight: bold;
        margin-bottom: 18px;
    }

    label {
        float: left;
        font-size: 14px;
        font-weight: 500;
        color: #6a4a85;
        margin-top: 8px;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border-radius: 10px;
        border: 2px solid #e5c9ff;
        background: #faf5ff;
        outline: none;
    }

    input:focus {
        border-color: #c066ff;
        box-shadow: 0 0 8px rgba(192, 102, 255, 0.4);
    }

    button {
        width: 100%;
        background: linear-gradient(to right, #c066ff, #ff77d4);
        padding: 12px;
        font-size: 17px;
        margin-top: 18px;
        border: none;
        color: white;
        border-radius: 25px;
        font-weight: 600;
        cursor: pointer;
        transition: 0.3s;
    }
    button:hover {
        transform: scale(1.06);
        box-shadow: 0 4px 12px rgba(255, 121, 193, 0.4);
    }

    @keyframes fadeIn {
        from {opacity: 0; transform: translateY(15px);}
        to {opacity: 1; transform: translateY(0);}
    }

</style>
</head>
<body>

<div class="edit-box">
    <h2>Edit Employee Details</h2>
    <form action="Update" method="post">

        <input type="hidden" name="empid" value="<%=emp.getEmpid()%>">

        <label>Name:</label>
        <input type="text" name="ename" value="<%=emp.getEname()%>" required>

        <label>Dept:</label>
        <input type="text" name="dept" value="<%=emp.getDept()%>" required>

        <label>Salary:</label>
        <input type="text" name="salary" value="<%=emp.getSalary()%>" required>

        <label>Phone:</label>
        <input type="text" name="phone" value="<%=emp.getPhone()%>" required>

        <label>Email:</label>
        <input type="text" name="email" value="<%=emp.getEmail()%>" required>

        <label>Password:</label>
        <input type="password" name="password" value="<%=emp.getPassword()%>" required>

        <button type="submit">Update</button>
    </form>
</div>

</body>
</html>
