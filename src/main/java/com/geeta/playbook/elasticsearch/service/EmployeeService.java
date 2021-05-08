package com.geeta.playbook.elasticsearch.service;

import com.geeta.playbook.elasticsearch.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee save(Employee employee);

    void delete(Employee employee);

    Optional<Employee> findById(String id);

    Iterable<Employee> findAll();

    Page<Employee> findByName(String name, PageRequest pageRequest);

    List<Employee> findByHireDate(String hireDate);

}
