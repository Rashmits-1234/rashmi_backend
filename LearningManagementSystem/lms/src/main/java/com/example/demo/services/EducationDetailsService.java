package com.example.demo.services;

import com.example.demo.entity.EducationDetails;
import com.example.demo.repository.EducationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EducationDetailsService {

    @Autowired
    private EducationDetailsRepository repository;

    public List<EducationDetails> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<EducationDetails> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public EducationDetails saveEmployee(EducationDetails employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
