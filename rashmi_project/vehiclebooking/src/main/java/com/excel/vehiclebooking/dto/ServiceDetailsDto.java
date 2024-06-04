package com.excel.vehiclebooking.dto;



import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ServiceDetailsDto {

	private String serviceDescription;
	private String packageName;
	private String packageCost;
	private Integer vehicleRegId;
	private Integer employeeId;
	private Integer customerRegId;
}
