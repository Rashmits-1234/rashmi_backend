package com.excel.hibernate_rashmi.entity;

import java.sql.Date;

import com.google.protobuf.Timestamp;

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
	@Table(name = "ServiceBookings")
	public class ServiceBooking {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "booking_id")
	    private int bookingId;

	    @ManyToOne
	    @JoinColumn(name = "vehicle_id")
	    private Vehicle vehicle;

	    @ManyToOne
	    @JoinColumn(name = "center_id")
	    private ServiceCenter serviceCenter;

	    @Column(name = "booking_date")
	    private Date bookingDate;

	    @Column(name = "service_package")
	    private String servicePackage;

	    @Column(name = "status")
	    private String status;

	    @Column(name = "scheduled_start_time")
	    private Timestamp scheduledStartTime;

	    @Column(name = "scheduled_end_time")
	    private Timestamp scheduledEndTime;

	}


