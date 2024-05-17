package com.example.demo.repository;

import com.example.demo.entity.EmployeePrimaryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePrimaryInfoRepository extends JpaRepository<EmployeePrimaryInfo, Integer> {
}
