<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="Navbar.jsp"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>

<style>

/* 🌈 Purple Navbar */
.navbar {
    background: #ffb6d9 !important;
    padding: 12px;
}
.navbar a {
    color: white !important;
    font-weight: 500;
    font-size: 16px;
}

/* 🌸 Background bubbles */
body {
    font-family: "Poppins", Arial;
    background: #ffffff;
    height: 100vh;
    margin: 0;
    overflow-x: hidden;
    position: relative;
}

/* Left bubble */
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

/* Right bubble */
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
.container {
    width: 450px;
    margin: 140px auto;
    background: #ffffff;
    padding: 35px;
    border-radius: 25px;
    box-shadow: 0 8px 25px rgba(0,0,0,0.12);
    animation: fadeIn 0.8s ease-out;
    position: relative;
    z-index: 10;
}

h2 {
    text-align: center;
    font-size: 28px;
    color: #a835ff;
    font-weight: 600;
    margin-bottom: 20px;
}

/* Labels */
label {
    margin-top: 10px;
    color: #6a4a85;
    font-weight: 500;
}

/* Inputs */
input[type="text"],
input[type="number"],
input[type="email"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-top: 6px;
    border-radius: 12px;
    border: 2px solid #e5c9ff;
    background: #faf5ff;
    font-size: 15px;
    transition: 0.25s;
}

input:focus {
    border-color: #c066ff;
    box-shadow: 0 0 8px rgba(192, 102, 255, 0.4);
    outline: none;
}

/* Register Button */
input[type="submit"] {
    width: 100%;
    padding: 12px;
    margin-top: 22px;
    background: linear-gradient(to right, #c066ff, #ff77d4);
    border: none;
    border-radius: 25px;
    color: white;
    font-size: 18px;
    font-weight: 600;
    cursor: pointer;
    transition: 0.3s;
}

input[type="submit"]:hover {
    transform: scale(1.05);
    box-shadow: 0 5px 15px rgba(255, 121, 193, 0.4);
}

/* Fade animation */
@keyframes fadeIn {
    from { opacity: 0; transform: translateY(20px); }
    to { opacity: 1; transform: translateY(0); }
}

</style>

</head>

<body>

    <div class="container">
        <h2>Employee Registration</h2>

        <form action="Register" method="post">
            
            <label>Employee ID:</label>
            <input type="text" name="empid" required>

            <label>Employee Name:</label>
            <input type="text" name="ename" required>

            <label>Department:</label>
            <input type="text" name="dept" required>

            <label>Salary:</label>
            <input type="text" name="salary" required>

            <label>Phone Number:</label>
            <input type="number" name="phone" required>

            <label>Email:</label>
            <input type="email" name="email" required>

            <label>Password:</label>
            <input type="password" name="password" required>

            <input type="submit" value="Register">

        </form>
    </div>

</body>
</html>
