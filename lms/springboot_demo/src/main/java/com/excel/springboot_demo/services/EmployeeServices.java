package com.excel.springboot_demo.services;


import java.util.List;

import com.excel.springboot_demo.dto.EmployeeDto;


public interface EmployeeServices {

	public EmployeeDto addEmployee(EmployeeDto dto);
	
	public void deleteEmployee(Integer id);
	
	public List<EmployeeDto> getAllEmployees();
	
	public EmployeeDto getEmployee(Integer id);
	
	public EmployeeDto updateEmployee(EmployeeDto dto);
	
	
	
	
}
