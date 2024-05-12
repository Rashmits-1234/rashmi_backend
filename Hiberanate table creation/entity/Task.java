package com.excel.hibernate_rashmi.entity;

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
	@Table(name = "Tasks")
	public class Task {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "task_id")
	    private int taskId;

	    @ManyToOne
	    @JoinColumn(name = "booking_id")
	    private ServiceBooking booking;

	    @Column(name = "task_description")
	    private String taskDescription;

	    @Column(name = "status")
	    private String status;

	    @Column(name = "start_time")
	    private Timestamp startTime;

	    @Column(name = "end_time")
	    private Timestamp endTime;

	}


