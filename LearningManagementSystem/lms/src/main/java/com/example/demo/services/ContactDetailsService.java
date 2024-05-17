package com.example.demo.services;

import com.example.demo.entity.ContactDetails;
import com.example.demo.repository.ContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContactDetailsService {

    @Autowired
    private ContactDetailsRepository repository;

    public List<ContactDetails> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<ContactDetails> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public ContactDetails saveEmployee(ContactDetails employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
