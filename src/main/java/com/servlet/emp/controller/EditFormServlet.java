package com.servlet.emp.controller;

import java.io.IOException;

import com.servlet.emp.dao.EmployeeDAOImp1;
import com.servlet.emp.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EditForm")
public class EditFormServlet extends HttpServlet {
    EmployeeDAOImp1 edao = new EmployeeDAOImp1();
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int empId = Integer.parseInt(req.getParameter("empid"));
        Employee emp = edao.findEmployeeById(empId);
        
        if(emp!=null) {
        req.setAttribute("employee", emp);
        req.getRequestDispatcher("EditForm.jsp").forward(req, resp);
    }
}
}
