package com.example.demo.services;

import com.example.demo.entity.TechnicalSkills;
import com.example.demo.repository.TechnicalSkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TechnicalSkillsService {

    @Autowired
    private TechnicalSkillsRepository repository;

    public List<TechnicalSkills> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<TechnicalSkills> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public TechnicalSkills saveEmployee(TechnicalSkills employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
