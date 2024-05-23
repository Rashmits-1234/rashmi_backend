package com.excel.util;

import java.util.ArrayList;

import com.excel.dto.BankDetailsDto;
import com.excel.dto.EmployeePrimaryInfoDto;
import com.excel.dto.EmployeeSecondaryInfoDto;
import com.excel.dto.TechnicalSkillsDto;
import com.excel.entity.BankDetails;
import com.excel.entity.EmployeePrimaryInfo;
import com.excel.entity.EmployeeSecondaryInfo;
import com.excel.entity.TechnicalSkills;
import com.excel.enums.AccountType;

public class EmployeeUtil {

	public static EmployeePrimaryInfo dtoToEntity(EmployeePrimaryInfoDto dto) {
		return EmployeePrimaryInfo.builder()
				.employeeId(dto.getEmployeeId())
//				.employeePrimaryId(dto.getEmployeePrimaryId())
				.employeeName(dto.getEmployeeName())
				.email(dto.getEmail())
				.nationality(dto.getNationality())
				.dateOfBirth(dto.getDateOfBirth())
				.dateOfJoining(dto.getDateOfJoining())
				.gender(dto.getGender())
				.employeeStatus(dto.getEmployeeStatus())
				.bloodGroup(dto.getBloodGroup())
				.designation(dto.getDesignation())
				.build();
	}
	

	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto dto) {
		return EmployeeSecondaryInfo.builder().panNo(dto.getPanNo())
				.aadharNo(dto.getAadharNo()).motherName(dto.getMotherName())
				.fatherName(dto.getFatherName()).passportNo(dto.getPassportNo())
				.spouseName(dto.getSpouseName()).maritalStatus(dto.getMaritalStatus()).build();
	}

	
	public static BankDetails dtoToEntity(BankDetailsDto dto) {
		return BankDetails.builder().accountNo(dto.getAccountNo())
				.accountType(dto.getAccountType())
				.branch(dto.getBranch()).bankName(dto.getBankName())
				.ifscCode(dto.getIfscCode()).state(dto.getState()).build();
	}
	public static TechnicalSkills dtoToSkillEntity(TechnicalSkillsDto dto) {
		return TechnicalSkills.builder().skillType(dto.getSkillType())
				.skillRatings(dto.getSkillRatings())
				.yearOfExperience(dto.getYearOfExperience()).employeePrimaryInfo(new ArrayList<>()).build();
	}
}
