package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findEmployeeById(Integer id);

    List<Employee> findAllEmployee();

    Employee addEmployee(Employee employee);

    List<Employee> deleteEmployee(Integer id);
}
