package com.excel.vehiclebooking.service;

import com.excel.vehiclebooking.dto.CustomerRegistrationDto;
import com.excel.vehiclebooking.entity.CustomerRegistration;
import com.excel.vehiclebooking.exception.CustomerNotFoundException;
import com.excel.vehiclebooking.repository.CustomerRepository;
import com.excel.vehiclebooking.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerUtil customerUtil;

    @Override
    public Integer saveCustomerInfo(CustomerRegistrationDto dto) {
        CustomerRegistration customerRegistration = CustomerUtil.dtoToCustomerRegistrationEntity(dto);
        customerRegistration = customerRepository.save(customerRegistration);
        return customerRegistration.getCustomerRegId();
    }

    @Override
    public List<CustomerRegistrationDto> getAllCustomers() {
        List<CustomerRegistration> customers = customerRepository.findAll();
        return customers.stream()
                .map(customerUtil::customerRegistrationEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerRegistrationDto getCustomer(Integer id) {
        CustomerRegistration customerRegistration = customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
        return customerUtil.customerRegistrationEntityToDto(customerRegistration);
    }

    @Override
    public Integer deleteCustomer(CustomerRegistrationDto dto) {
        CustomerRegistration customerRegistration = CustomerUtil.dtoToCustomerRegistrationEntity(dto);
        customerRepository.delete(customerRegistration);
        return customerRegistration.getCustomerRegId();
    }
    @Override
    public Integer updateCustomer(CustomerRegistrationDto dto) {
        CustomerRegistration customerRegistration = CustomerUtil.dtoToCustomerRegistrationEntity(dto);
        customerRegistration = customerRepository.save(customerRegistration);
        return customerRegistration.getCustomerRegId();
    }
}




