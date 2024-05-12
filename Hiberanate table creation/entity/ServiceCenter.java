package com.excel.hibernate_rashmi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
	@Table(name = "ServiceCenters")
	public class ServiceCenter {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "center_id")
	    private int centerId;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    @Column(name = "center_name")
	    private String centerName;

	    @Column(name = "location")
	    private String location;

	    @Column(name = "contact_phone")
	    private String contactPhone;

	    @Column(name = "contact_email")
	    private String contactEmail;

	   
	}


