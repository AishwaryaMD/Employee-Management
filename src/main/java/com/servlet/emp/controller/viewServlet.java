package com.servlet.emp.controller;

import java.io.IOException;
import java.util.List;

import com.servlet.emp.dao.EmployeeDAO;
import com.servlet.emp.dao.EmployeeDAOImp1;
import com.servlet.emp.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/View")
public class viewServlet extends HttpServlet{
	
	EmployeeDAO edao=null;
	public viewServlet() {
			 edao = new EmployeeDAOImp1();
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			List<Employee> elist=edao.getAllEmployee();
			if(!elist.isEmpty()) {
				req.setAttribute("emplist", elist);
	            req.getRequestDispatcher("View-All.jsp")
	            .forward(req,  res);
			}
		}
	}


