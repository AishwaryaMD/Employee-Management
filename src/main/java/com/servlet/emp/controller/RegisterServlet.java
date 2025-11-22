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

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	
	EmployeeDAO edao= null;
	public RegisterServlet() {
		
		edao= new EmployeeDAOImp1();
	}
 
	@Override protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		int empid=Integer.parseInt(req.getParameter("empid")); 
		String empname=req.getParameter("ename"); 
		String dept= req.getParameter("dept"); 
		double salary= Double.parseDouble(req.getParameter("salary")); 
		long phone=Long.parseLong(req.getParameter("phone")); 
		String email=req.getParameter("email"); 
		String password=req.getParameter("password"); 
		Employee employee= new Employee(empid, empname, dept, salary, phone, email, password); 
		boolean isRegistered=edao.registerEmployee(employee); 
		/*if(isRegistered) { 
			req.getRequestDispatcher("/Login.jsp") 
			.forward(req, resp);; 
			} else { 
				req.getRequestDispatcher("/Register.jsp") 
				.forward(req, resp);; 
				} 
	    */
		if(isRegistered) { 
		    resp.sendRedirect("Login.jsp");
		} else { 
		    resp.sendRedirect("Register.jsp");
		}

		} 
	}
