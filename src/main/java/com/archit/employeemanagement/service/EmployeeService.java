package com.archit.employeemanagement.service;

import com.archit.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployee(long id);
}
