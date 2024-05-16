package com.example.demo.entity;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.enums.ContactType;
import com.example.demo.enums.Education;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name = "contact_details")
@RequestMapping("/contactDetails")
public class ContactDetails {
	@Id
	@GeneratedValue()
	
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private ContactType contactType;
	private String contactNo;
}
