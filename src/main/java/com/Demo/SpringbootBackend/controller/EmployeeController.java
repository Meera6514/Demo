package com.Demo.SpringbootBackend.controller;

import com.Demo.SpringbootBackend.model.Employee;
import com.Demo.SpringbootBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/v1/")
public class EmployeeController {
   @Autowired
    private EmployeeRepository employeeRepository;

   //Get all Employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
    //create Employees
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeRepository.save(employee);
    }
}
