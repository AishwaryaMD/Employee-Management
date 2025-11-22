package com.servlet.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.servlet.emp.dto.Employee;
import com.servlet.util.DbConnection;

public class EmployeeDAOImp1 implements EmployeeDAO {
	Connection con = null;
	
	 @Override
	 public boolean registerEmployee(Employee emp) {
	
		 con=DbConnection.getConnector();
		 String register= "INSERT INTO employee VALUES(?,?,?,?,?,?,?)";

		 try {
		 PreparedStatement pstmt= con.prepareStatement(register);
		 pstmt.setInt(1,  emp.getEmpid());
		 pstmt.setString(2,  emp.getEname());
		 pstmt.setString(3,  emp.getDept());
		 pstmt.setDouble(4,  emp.getSalary());
		 pstmt.setLong(5,  emp.getPhone());
		 pstmt.setString(6,  emp.getEmail());
		 pstmt.setString(7,  emp.getPassword());
		 
		 int count=pstmt.executeUpdate();
		 if(count>0) {
			 return true;
		 }
		 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		 
		return false;
	 }
	 
	 @Override
	 public Employee loginEmployee(String email, String password) {
		 
		 String login ="SELECT * FROM employee WHERE email=? AND password=?";
		 con=DbConnection.getConnector();
		 Employee emp=null;
		 try {
			 PreparedStatement pstmt= con.prepareStatement(login);
			 pstmt.setString(1,  email);
			 pstmt.setString(2,  password);
			 ResultSet rs=pstmt.executeQuery();
			 
			 if(rs.next()) {
			   emp = new Employee();
			   emp.setEmpid(rs.getInt(1));
			   emp.setEname(rs.getString(2));
			   emp.setDept(rs.getString(3));
               emp.setSalary(rs.getDouble(4));
			   emp.setPhone(rs.getLong(5));
			   emp.setEmail(rs.getString(6));
			   emp.setPassword(rs.getString(7));  
			 }
		 }catch(SQLException e) {
			 e.printStackTrace();
		 } 
		 return emp;
	 }

		 @Override
		 public List<Employee>  getAllEmployee(){
			 String viewAllEmps="SELECT * FROM employee";
			 con=DbConnection.getConnector();
			 List<Employee> emplist=new ArrayList<>();
			 Employee emp=null;
			 try {
				 PreparedStatement pstmt=con.prepareStatement(viewAllEmps);
				 ResultSet rs=pstmt.executeQuery();
				 while(rs.next()) {
					 System.out.println("Create new Employee object for each iteration");
					   emp= new Employee();
					   emp.setEmpid(rs.getInt(1));
					   emp.setEname(rs.getString(2));
					   emp.setDept(rs.getString(3));
		               emp.setSalary(rs.getDouble(4));
					   emp.setPhone(rs.getLong(5));
					   emp.setEmail(rs.getString(6));
					   emp.setPassword(rs.getString(7));  
					   emplist.add(emp);             //adding each record into list
				 }
			 }catch(SQLException e) {
				 e.printStackTrace();
			 }
			 return emplist;
		 }
		 @Override
		 public boolean deleteEmployee(int empid) {
			 String deleteEmp="DELETE FROM employee WHERE empid=?";
			 con=DbConnection.getConnector();
			 try {
			 PreparedStatement pstmt=con.prepareStatement(deleteEmp);
			 pstmt.setInt(1,  empid );
			 int count=pstmt.executeUpdate();
			 if(count>0) {
				 return true;
			 }
			 }catch(SQLException e) {
				 e.printStackTrace();
			 }
			 return false;
		 }
		 @Override
		public Employee findEmployeeById(int empid) {
			String empById="SELECT* FROM employee WHERE empid=?";
			con=DbConnection.getConnector();
			 Employee emp = null;  
			try {
			PreparedStatement pstmt =con.prepareStatement(empById);
			pstmt.setInt(1, empid);
			ResultSet rs=pstmt.executeQuery();
			
			 if(rs.next()) {
		            emp = new Employee();     
		            emp.setEmpid(rs.getInt(1));
		            emp.setEname(rs.getString(2));
		            emp.setDept(rs.getString(3));
		            emp.setSalary(rs.getDouble(4));
		            emp.setPhone(rs.getLong(5));
		            emp.setEmail(rs.getString(6));
		            emp.setPassword(rs.getString(7));
		        } 
			 
			}catch(SQLException e) {
			 e.printStackTrace();	
			
			}
			return emp;
		}
		 @Override
		 public boolean updateEmployee(Employee emp) {

		     String updateEmp = "UPDATE employee SET ename=?, dept=?, salary=?, phone=?, email=?, password=? WHERE empid=?";

		     con = DbConnection.getConnector();

		     try {
		         PreparedStatement pstmt = con.prepareStatement(updateEmp);
		         pstmt.setString(1, emp.getEname());
		         pstmt.setString(2, emp.getDept());
		         pstmt.setDouble(3, emp.getSalary());
		         pstmt.setLong(4, emp.getPhone());
		         pstmt.setString(5, emp.getEmail());
		         pstmt.setString(6, emp.getPassword());
		         pstmt.setInt(7, emp.getEmpid());

		         int count = pstmt.executeUpdate();
		         return count > 0;

		     } catch (SQLException e) {
		         e.printStackTrace();
		     }

		     return false;
		 }

}
