package com.servlet.emp.dao;

import java.util.List;
import com.servlet.emp.dto.Employee;

public interface EmployeeDAO {
    
    boolean registerEmployee(Employee emp);
    Employee loginEmployee(String email, String password);
    List<Employee> getAllEmployee();
    boolean deleteEmployee(int empid);
    Employee findEmployeeById(int empid);
    

    boolean updateEmployee(Employee emp);
}
