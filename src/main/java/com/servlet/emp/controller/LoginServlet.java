package com.servlet.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.emp.dao.EmployeeDAO;
import com.servlet.emp.dao.EmployeeDAOImp1;
import com.servlet.emp.dto.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	EmployeeDAO edao=null;
	public LoginServlet() {
		 edao= new EmployeeDAOImp1();	 
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
        Employee emp= edao.loginEmployee(email,password);
        HttpSession session= req.getSession();
        System.out.println("Created Session Object");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
		if(emp!=null) {
			System.out.println("Employee object found"+emp);
			session.setAttribute("Employee", emp);
			
			out.print("Logged In Successfully");
			req.getRequestDispatcher("Dashboard.jsp")
			.include(req, resp);
			
		
			
		}
	}

}
