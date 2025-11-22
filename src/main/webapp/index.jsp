<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

<link rel="stylesheet"
 href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

<style>

    body {
        margin: 0;
        font-family: "Poppins", sans-serif;
        background: #ffffff;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        overflow: hidden;
        position: relative;
    }

    /* Pink & Purple floating bubbles */
    .bubble {
        position: absolute;
        border-radius: 50%;
        filter: blur(2px);
        animation: float 8s infinite ease-in-out;
        opacity: 0.7;
    }

    .bubble:nth-child(1) {
        width: 220px;
        height: 220px;
        background: #ffb3d9;
        top: -40px;
        left: -40px;
        animation-duration: 10s;
    }

    .bubble:nth-child(2) {
        width: 300px;
        height: 300px;
        background: #cfa0ff;
        bottom: -70px;
        right: -50px;
        animation-duration: 12s;
    }

    .bubble:nth-child(3) {
        width: 160px;
        height: 160px;
        background: #ffd1e8;
        top: 150px;
        left: -60px;
        animation-duration: 14s;
    }

    .bubble:nth-child(4) {
        width: 180px;
        height: 180px;
        background: #e5b3ff;
        bottom: 120px;
        right: -40px;
        animation-duration: 11s;
    }

    @keyframes float {
        0%   { transform: translateY(0px); }
        50%  { transform: translateY(-30px); }
        100% { transform: translateY(0px); }
    }

    /* Center glass box */
    .box {
        position: relative;
        z-index: 10;
        background: rgba(255, 255, 255, 0.55);
        backdrop-filter: blur(15px);
        padding: 45px;
        width: 460px;
        border-radius: 25px;
        text-align: center;
        box-shadow: 0 8px 35px rgba(0,0,0,0.15);
        animation: fadeIn 1s ease-in-out;
        border: 1px solid rgba(255, 182, 215, 0.4);
    }

    h1 {
        font-size: 32px;
        font-weight: 600;
        color: #b83397;
        margin-bottom: 15px;
    }

    p {
        color: #7a5f82;
        font-size: 16px;
        margin-bottom: 25px;
    }

    .btn-custom {
        width: 160px;
        padding: 12px;
        font-size: 16px;
        border-radius: 30px;
        margin: 10px;
        transition: 0.25s ease-in-out;
        font-weight: 500;
    }

    .btn-login {
        background-color: #d57bff;
        color: white;
        box-shadow: 0 4px 12px rgba(213, 123, 255, 0.4);
    }

    .btn-login:hover {
        background-color: #c069f3;
        transform: scale(1.06);
    }

    .btn-register {
        background-color: #ff9ecf;
        color: white;
        box-shadow: 0 4px 12px rgba(255, 158, 207, 0.4);
    }

    .btn-register:hover {
        background-color: #ff89c5;
        transform: scale(1.06);
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to   { opacity: 1; transform: translateY(0); }
    }

</style>
</head>
<body>

<!-- floating bubbles -->
<div class="bubble"></div>
<div class="bubble"></div>
<div class="bubble"></div>
<div class="bubble"></div>

<!-- glass box -->
<div class="box">
    <h1>Employee Management</h1>
    <p>Manage your team with a smooth, modern & beautiful interface 💗</p>

    <a href="Login.jsp" class="btn btn-custom btn-login">Login</a>
    <a href="Register.jsp" class="btn btn-custom btn-register">Register</a>
</div>

</body>
</html>
