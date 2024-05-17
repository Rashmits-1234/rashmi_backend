package com.example.demo.controller;

import com.example.demo.entity.EmployeePrimaryInfo;
import com.example.demo.services.EmployeePrimaryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeePrimaryInfoController {

    @Autowired
    private EmployeePrimaryInfoService service;

    @GetMapping
    public List<EmployeePrimaryInfo> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeePrimaryInfo> getEmployeeById(@PathVariable Integer id) {
        Optional<EmployeePrimaryInfo> employee = service.getEmployeeById(id);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public EmployeePrimaryInfo createEmployee(@RequestBody EmployeePrimaryInfo employee) {
        return service.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeePrimaryInfo> updateEmployee(@PathVariable Integer id, @RequestBody EmployeePrimaryInfo employeeDetails) {
        Optional<EmployeePrimaryInfo> employee = service.getEmployeeById(id);
        if (employee.isPresent()) {
            EmployeePrimaryInfo updatedEmployee = employee.get();
            updatedEmployee.setEmployeeName(employeeDetails.getEmployeeName());
            updatedEmployee.setDateOfJoining(employeeDetails.getDateOfJoining());
            updatedEmployee.setDateOfBirth(employeeDetails.getDateOfBirth());
            updatedEmployee.setEmail(employeeDetails.getEmail());
            updatedEmployee.setBloodGroup(employeeDetails.getBloodGroup());
            updatedEmployee.setDesignation(employeeDetails.getDesignation());
            updatedEmployee.setGender(employeeDetails.getGender());
            updatedEmployee.setNationality(employeeDetails.getNationality());
            updatedEmployee.setEmployeeStatus(employeeDetails.getEmployeeStatus());
            return ResponseEntity.ok(service.saveEmployee(updatedEmployee));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
        service.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
