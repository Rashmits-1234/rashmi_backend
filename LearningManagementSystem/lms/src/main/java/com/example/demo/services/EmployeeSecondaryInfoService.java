package com.example.demo.services;

import com.example.demo.entity.EmployeeSecondaryInfo;
import com.example.demo.repository.EmployeeSecondaryInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeSecondaryInfoService {

    @Autowired
    private EmployeeSecondaryInfoRepository repository;

    public List<EmployeeSecondaryInfo> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<EmployeeSecondaryInfo> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public EmployeeSecondaryInfo saveEmployee(EmployeeSecondaryInfo employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
