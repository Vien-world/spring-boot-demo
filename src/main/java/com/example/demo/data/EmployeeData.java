package com.example.demo.data;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeData implements CommandLineRunner{
    private final EmployeeRepository employeeRepository;

    public EmployeeData(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Load employee data");

        Employee em1 = new Employee();
        em1.setFirstName("Pikachu");
        em1.setLastName("Raichu");
        em1.setAddress("kanto");
        employeeRepository.save(em1);

        System.out.println("Employee saved: " + employeeRepository.count());
    }
}
