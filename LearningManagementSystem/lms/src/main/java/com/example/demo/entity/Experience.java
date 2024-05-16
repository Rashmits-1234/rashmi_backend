package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import com.example.demo.enums.Designation;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "experience")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer id;
	
	private String companyName;
	private int yearOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	@Enumerated(EnumType.STRING)
	private Designation DesignationType;
	private String location;
	
	 @ManyToOne
	    @JoinColumn(name = "employee_id")
	    private EmployeePrimaryInfo employee;
}
