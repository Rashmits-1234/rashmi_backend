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
	@Table(name = "Notifications")
	public class Notification {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "notification_id")
	    private int notificationId;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    @Column(name = "notification_type")
	    private String notificationType;

	    @Column(name = "message")
	    private String message;

	    @Column(name = "sent_datetime")
	    private Timestamp sentDatetime;

	    @Column(name = "is_read")
	    private boolean isRead;

	}


