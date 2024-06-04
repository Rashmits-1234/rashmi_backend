package com.excel.vehiclebooking.service;

import com.excel.vehiclebooking.dto.BookingListDto;
import com.excel.vehiclebooking.dto.CustomerRegistrationDto;

import java.util.List;

public interface CustomerRegistrationService {
     Integer saveCustomerInfo(CustomerRegistrationDto dto);
     List<CustomerRegistrationDto> getAllCustomers();

     CustomerRegistrationDto getCustomer(Integer id);

     Integer deleteCustomer(CustomerRegistrationDto dto);

     Integer updateCustomer(CustomerRegistrationDto dto);
}
