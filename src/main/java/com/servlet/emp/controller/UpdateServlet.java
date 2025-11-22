package com.servlet.emp.controller;

import java.io.IOException;

import com.servlet.emp.dao.EmployeeDAO;
import com.servlet.emp.dao.EmployeeDAOImp1;
import com.servlet.emp.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Update")
public class UpdateServlet extends HttpServlet {

    EmployeeDAO edao = null;

    public UpdateServlet() {
        edao = new EmployeeDAOImp1();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	int empid=Integer.parseInt(req.getParameter("empid")); 
		String empname=req.getParameter("ename"); 
		String dept= req.getParameter("dept"); 
		double salary= Double.parseDouble(req.getParameter("salary")); 
		long phone=Long.parseLong(req.getParameter("phone")); 
		String email=req.getParameter("email"); 
		String password=req.getParameter("password"); 
		Employee employee= new Employee(empid, empname, dept, salary, phone, email, password); 
		boolean isUpdated = edao.updateEmployee(employee);

   /*     Employee emp = new Employee();
        emp.setEmpid(empid);
        emp.setEname(ename);
        emp.setDept(dept);
        emp.setSalary(salary);
        emp.setPhone(phone);
        emp.setEmail(email);
        emp.setPassword(password); 

        boolean isUpdated = edao.updateEmployee(emp);  */

        if (isUpdated) {
            resp.sendRedirect("View"); // after update, redirect to view all employees
        } else {
            resp.getWriter().print("<h3 style='color:red;'>Update Failed!</h3>");
        }
    }
}
