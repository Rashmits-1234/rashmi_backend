package com.excel.hibernate_rashmi.entity;

import com.google.protobuf.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Table(name = "Users")
	public class User {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id")
	    private int userId;
	    
	    @Column(name = "username")
	    private String username;
	    
	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "password_hash")
	    private String passwordHash;
	    
	    @Column(name = "is_admin")
	    private boolean isAdmin;
	    
	    @Column(name = "created_at")
	    private Timestamp createdAt;
}
