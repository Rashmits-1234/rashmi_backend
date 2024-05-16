package com.excel.springboot_demo.util;

import java.util.List;

import com.excel.springboot_demo.dto.EmployeeDto;
import com.excel.springboot_demo.entity.Employee;

public class EmployeeUtil {
	private EmployeeUtil()
	{}

	public static EmployeeDto entityToDto(Employee employee)
	{
		return EmployeeDto.builder().id(employee.getId()).
				aadhaarNo(employee.getAadhaarNo()).
				firstName(employee.getFirstName()).
				lastName(employee.getLastName()).
				mobileNo(employee.getMobileNo()).
				panNo(employee.getPanNo()).
				employeeNo(employee.getEmployeeNo()).build();
		
	}
	
	public static Employee updatevalues(Employee employee, EmployeeDto dto)
	{
		employee.setFirstName(dto.getFirstName());
		employee.setLastName(dto.getLastName());
		employee.setMobileNo(dto.getMobileNo());
		return employee;}

	public static List<EmployeeDto> entityListToDtoList(List<Employee> employees) {
		return null;
	}
	
}
