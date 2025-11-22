package com.servlet.emp.controller;

import java.io.IOException;

import com.servlet.emp.dao.EmployeeDAO;
import com.servlet.emp.dao.EmployeeDAOImp1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet{
	
	EmployeeDAO edao=null;
	public DeleteServlet() {
		edao=new EmployeeDAOImp1();
	}
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	int empId=Integer.parseInt(req.getParameter("empid"));
    	boolean isDeleted =edao.deleteEmployee(empId);
    	if(isDeleted) {
    		resp.sendRedirect("View");
    	}
    	else {
    		
    	}
    }

}
