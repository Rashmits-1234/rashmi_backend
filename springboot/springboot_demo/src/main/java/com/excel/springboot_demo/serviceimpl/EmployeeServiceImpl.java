package com.excel.springboot_demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.springboot_demo.constant.EmployeeConstant;
import com.excel.springboot_demo.dto.EmployeeDto;
import com.excel.springboot_demo.entity.Employee;
import com.excel.springboot_demo.exceptionhandler.EmployeeNotFound;
import com.excel.springboot_demo.repository.EmployeeRepository;
import com.excel.springboot_demo.services.EmployeeServices;
import com.excel.springboot_demo.util.EmployeeUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeServices {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDto addEmployee(EmployeeDto dto) {
        Employee employee = Employee.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .mobileNo(dto.getMobileNo())
                .aadhaarNo(dto.getAadhaarNo())
                .panNo(dto.getPanNo())
                .employeeNo(dto.getEmployeeNo())
                .build();

        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeUtil.entityToDto(savedEmployee);
    }

    public EmployeeDto getEmployee(Integer id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            Employee employee = optional.get();
            return EmployeeUtil.entityToDto(employee);
        } else {
            throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_ID_NOTFOUND);
        }
    }

    public void deleteEmployee(Integer id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employeeRepository.delete(optional.get());
        } else {
            throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_ID_NOTFOUND);
        }
    }

    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return EmployeeUtil.entityListToDtoList(employees);
    }

    public EmployeeDto updateEmployee(EmployeeDto dto) {
        Optional<Employee> optional = employeeRepository.findById(dto.getId());
        if (optional.isPresent()) {
            Employee employee = optional.get();
            employee = EmployeeUtil.updatevalues(employee, dto);
            Employee updatedEmployee = employeeRepository.save(employee);
            return EmployeeUtil.entityToDto(updatedEmployee);
        } else {
            throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_ID_NOTFOUND);
        }
    }
}
