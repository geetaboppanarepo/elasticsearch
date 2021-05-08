package com.geeta.playbook.elasticsearch.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;

@Getter
@Setter
public class EmployeeName {
    String name;
    PageRequest pageRequest;
}
