package com.geeta.playbook.elasticsearch.controller;


import com.geeta.playbook.elasticsearch.domain.EmployeeName;
import com.geeta.playbook.elasticsearch.model.Employee;
import com.geeta.playbook.elasticsearch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value="/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        Optional<Employee> opt =employeeService.findById(id);
        Employee employee=opt.get();
        System.out.println(employee);
        return employee;
    }

    @GetMapping(value="/employee/{hireDate}")
    public List<Employee> getEmployeeByHireDate(@PathVariable String hireDate){
        List<Employee> employees =employeeService.findByHireDate(hireDate);
        return employees;
    }

    @PostMapping(value="/name")
    public Page<Employee> getEmployeeByName(EmployeeName employeeName){
        Page<Employee> employees =employeeService.findByName(employeeName.getName(), employeeName.getPageRequest());
        return employees;
    }

    @GetMapping(value="/employee")
    public Iterable<Employee> getAllEmployees(){
        Iterable<Employee> employees =employeeService.findAll();
        return employees;
    }

    @PutMapping(value="/employee")
    public void save(Employee emp){
        employeeService.save(emp);
    }

    @DeleteMapping(value="/employee")
    public void delete(Employee emp){
        employeeService.delete(emp);
    }

}
