package com.reliableC.mysql_hibernate_springboot_project.repository;

import com.reliableC.mysql_hibernate_springboot_project.model.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
