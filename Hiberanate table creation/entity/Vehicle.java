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
	@Table(name = "Vehicles")
	public class Vehicle {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "vehicle_id")
	    private int vehicleId;

	    @ManyToOne
	    @JoinColumn(name = "owner_id")
	    private User owner;

	    @Column(name = "make")
	    private String make;

	    @Column(name = "model")
	    private String model;

	    @Column(name = "year")
	    private int year;

	    @Column(name = "vin_number")
	    private String vinNumber;

	    @Column(name = "license_plate")
	    private String licensePlate;

	    
	}


