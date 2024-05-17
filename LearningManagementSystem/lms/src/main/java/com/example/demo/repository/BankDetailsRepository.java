package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BankDetails;
@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer> {
}


