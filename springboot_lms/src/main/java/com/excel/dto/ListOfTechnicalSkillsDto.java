package com.excel.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListOfTechnicalSkillsDto {

	private List<EmployeePrimaryInfoDto> employeePrimaryInfos;
	private List<TechnicalSkillsDto> technicalSkills;
	public String getEmployeeId() {
		return null;
	}
}
