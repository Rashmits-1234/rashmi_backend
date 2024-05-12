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
	@Table(name = "Mechanics")
	public class Mechanic {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "mechanic_id")
	    private int mechanicId;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "center_id")
	    private ServiceCenter serviceCenter;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "experience")
	    private int experience;

	    @Column(name = "contact_phone")
	    private String contactPhone;

	   
	}


