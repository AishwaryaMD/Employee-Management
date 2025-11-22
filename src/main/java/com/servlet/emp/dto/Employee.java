package com.servlet.emp.dto;

public class Employee {
	
	    private int empid;
	    private String ename;
	    private String dept;
	    private double salary;
	    private long phone;
	    private String email;
	    private String password;
		public Object getsalary;
		
		public Employee() {
			
		}


	    public Employee(int empid, String ename, String dept, double salary, long phone, String email, String password) {
	        this.empid = empid;
	        this.ename = ename;
	        this.dept= dept;
	        this.salary = salary;
	        this.phone = phone;
	        this.email = email;
	        this.password = password;
	    }

	    public int getEmpid() {
	        return empid;
	    }
	    public void setEmpid(int empid) {
	        this.empid = empid;
	    }

	    public String getEname() {
	        return ename;
	    }
	    public void setEname(String ename) {
	        this.ename = ename;
	    }
	    public String getDept() {
	        return dept;
	    }
        public void setDept(String dept) {
        	this.dept = dept;
        }
	    
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public long getPhone() {
	        return phone;
	    }
	    public void setPhone(long phone) {
	        this.phone = phone;
	    }

	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	}



