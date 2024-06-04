package com.excel.vehiclebooking.controller;

import com.excel.vehiclebooking.constant.Vehicleconstants;
import com.excel.vehiclebooking.dto.BookingListDto;
import com.excel.vehiclebooking.dto.CustomerRegistrationDto;
import com.excel.vehiclebooking.response.CommonResponse;
import com.excel.vehiclebooking.service.CustomerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/customers")

public class CustomerRegistrtionController {

    @Autowired
    private CustomerRegistrationService customerRegistrationService;

    @PostMapping
    public ResponseEntity<CommonResponse<Integer>> registerCustomer(@RequestBody CustomerRegistrationDto dto) {
        Integer customerId = customerRegistrationService.saveCustomerInfo(dto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<Integer>builder().data(customerId).message("Customer registered successfully").build());
    }

    @GetMapping
    public ResponseEntity<List<CustomerRegistrationDto>> getAllCustomers() {
        return ResponseEntity.ok(customerRegistrationService.getAllCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerRegistrationDto> getCustomer(@PathVariable Integer id) {
        CustomerRegistrationDto customer = customerRegistrationService.getCustomer(id);
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@RequestBody CustomerRegistrationDto dto) {
        customerRegistrationService.deleteCustomer(dto);
        return ResponseEntity.ok("Customer deleted successfully");
    }

    @PutMapping
    public ResponseEntity<CommonResponse<Integer>> updateCustomer(@RequestBody CustomerRegistrationDto dto) {
        Integer updatedCustomerId = customerRegistrationService.updateCustomer(dto);
        return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<Integer>builder().data(updatedCustomerId)
                .message("Customer updated successfully").isError(false).build());
    }
}

