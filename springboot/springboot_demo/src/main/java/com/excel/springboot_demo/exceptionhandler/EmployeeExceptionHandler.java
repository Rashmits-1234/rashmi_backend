package com.excel.springboot_demo.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.springboot_demo.exceptionhandler.EmployeeNotFound;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> employeeNotFound(RuntimeException exe)
	{
		return ResponseEntity.ok(exe.getMessage());
		
	}
}
