package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ContactDetails;
@Repository
public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Integer> {
}


