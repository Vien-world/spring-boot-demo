package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(EmployeeController.url)
public class EmployeeController {
    public static final String url = "api/demo/employee";

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    List<Employee> getAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable Integer id){
        return employeeService.findEmployeeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/{id}")
    List<Employee> deleteEmployee(@PathVariable Integer id){
        return employeeService.deleteEmployee(id);
    }
}
