package com.excel.hibernate_rashmi.entity;

import java.sql.Date;

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
	@Table(name = "ServiceHistory")
	public class ServiceHistory {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "service_id")
	    private int serviceId;

	    @ManyToOne
	    @JoinColumn(name = "vehicle_id")
	    private Vehicle vehicle;

	    @ManyToOne
	    @JoinColumn(name = "center_id")
	    private ServiceCenter serviceCenter;

	    @Column(name = "service_date")
	    private Date serviceDate;

	    @Column(name = "service_details")
	    private String serviceDetails;

	    @Column(name = "invoice_number")
	    private String invoiceNumber;

	    @Column(name = "table_cost")
	    private double totalCost;

	}


