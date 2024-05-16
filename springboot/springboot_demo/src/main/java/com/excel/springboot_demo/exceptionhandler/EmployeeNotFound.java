package com.excel.springboot_demo.exceptionhandler;

public class EmployeeNotFound extends RuntimeException 
{

	public static final long serialVersionUID =1L;
	
	public EmployeeNotFound(String message)
	{
		super(message);
	}
}
