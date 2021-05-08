package com.geeta.playbook.elasticsearch.service;

import com.geeta.playbook.elasticsearch.model.Employee;
import com.geeta.playbook.elasticsearch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Optional<Employee> findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Page<Employee> findByName(String name, PageRequest pageRequest) {
        return employeeRepository.findByName(name, pageRequest);
    }

    @Override
    public List<Employee> findByHireDate(String hireDate) {
        return employeeRepository.findByHireDate(hireDate);
    }
}
