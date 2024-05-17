package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EducationDetails;

public interface EducationDetailsRepository {

	void deleteById(Integer id);

	EducationDetails save(EducationDetails employee);

	List<EducationDetails> findAll();

	Optional<EducationDetails> findById(Integer id);

	
	
}
