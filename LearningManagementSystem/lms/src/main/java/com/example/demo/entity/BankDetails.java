package com.example.demo.entity;

import com.example.demo.enums.AccountType;
import com.example.demo.enums.Education;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	private String accountNo;
	private String bankName;
	private String ifscCode;
	private String branch;
	private String state;
}
