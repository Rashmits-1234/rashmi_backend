package com.example.demo.repository;

import com.example.demo.entity.EmployeeSecondaryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSecondaryInfoRepository extends JpaRepository<EmployeeSecondaryInfo, Integer> {
}
