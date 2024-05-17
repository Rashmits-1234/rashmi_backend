package com.example.demo.services;

import com.example.demo.entity.BankDetails;
import com.example.demo.repository.BankDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BankDetailsService {

    @Autowired
    private BankDetailsRepository repository;

    public List<BankDetails> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<BankDetails> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public BankDetails saveEmployee(BankDetails employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
