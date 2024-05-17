package com.example.demo.services;

import com.example.demo.entity.EmployeePrimaryInfo;
import com.example.demo.repository.EmployeePrimaryInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeePrimaryInfoService {

    @Autowired
    private EmployeePrimaryInfoRepository repository;

    public List<EmployeePrimaryInfo> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<EmployeePrimaryInfo> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public EmployeePrimaryInfo saveEmployee(EmployeePrimaryInfo employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
