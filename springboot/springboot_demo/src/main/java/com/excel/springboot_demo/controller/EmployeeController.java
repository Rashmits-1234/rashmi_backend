package com.excel.springboot_demo.controller;

import java.util.List;
import static com.excel.springboot_demo.constant.EmployeeConstant.EMPLOYEE_DELETED_MESSAGE;
import static com.excel.springboot_demo.constant.EmployeeConstant.EMPLOYEE_ADDED_SUCCESS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.springboot_demo.commonresponse.CommonResponse;
import com.excel.springboot_demo.constant.EmployeeConstant;
import com.excel.springboot_demo.dto.EmployeeDto;
import com.excel.springboot_demo.services.EmployeeServices;
import com.excel.springboot_demo.services.EmployeeServices;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private final EmployeeServices employeeServices;
	
	@PostMapping("/add")
	public ResponseEntity<CommonResponse<EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto= employeeServices.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<EmployeeDto>builder()
						.data(dto).
						isError(false).message(EMPLOYEE_ADDED_SUCCESS).build());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeDto> getById(@PathVariable Integer id)
	{ EmployeeDto dto= employeeServices.getEmployee(id);
		return ResponseEntity.status(HttpStatus.OK).body(dto);	
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<Object> fetchAllEmployees() {
		return ResponseEntity.ok(employeeServices.getAllEmployees()) ;
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeDto dto) {
		employeeServices.deleteEmployee(dto.getId());
		return ResponseEntity.ok(EmployeeConstant.EMPLOYEE_DELETED_MESSAGE);
	}
	
	@PutMapping("/update")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto dto)
	{
		EmployeeDto update= employeeServices.updateEmployee(dto);
				return ResponseEntity.status(HttpStatus.OK).body(update);
	}
}
