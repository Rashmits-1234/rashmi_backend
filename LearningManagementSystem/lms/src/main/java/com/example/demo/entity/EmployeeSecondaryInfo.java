package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.example.demo.enums.MaritalStatus;

@Entity
@Table(name = "employee_secondary_info")
public class EmployeeSecondaryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pan;
    private String aadhar;
    private String fatherName;
    private String motherName;
    private String spouse;
    private String passportNo;

    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "primary_info_id", referencedColumnName = "id")
    private EmployeePrimaryInfo primary_Info;

    
}
