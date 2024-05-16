package com.excel.springboot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.springboot_demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
