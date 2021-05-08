package com.geeta.playbook.elasticsearch.repository;

import com.geeta.playbook.elasticsearch.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
    Page<Employee> findByName(String name, Pageable pageable);

    List<Employee> findByHireDate(String hireDate);
}
