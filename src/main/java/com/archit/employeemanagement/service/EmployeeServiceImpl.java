package com.archit.employeemanagement.service;

import com.archit.employeemanagement.model.Employee;
import com.archit.employeemanagement.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> opt = employeeRepo.findById(id);
        Employee employee = null;
        if(opt.isPresent()) {
            employee = opt.get();
        } else {
            throw new RuntimeException("Employee not found");
        }
        return employee;
    }

}
