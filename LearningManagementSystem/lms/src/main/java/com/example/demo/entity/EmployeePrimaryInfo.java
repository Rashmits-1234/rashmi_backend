package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.demo.enums.Designation;
import com.example.demo.enums.Gender;

@Entity
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String employeeId;
    private String employeeName;
    private LocalDate dateOfJoining;
    private LocalDate dateOfBirth;
    private String email;
    private String bloodGroup;

    @Enumerated(EnumType.STRING)
    private Designation designation;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationality;
    private String employeeStatus;

    @OneToOne(mappedBy = "primary_Info",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EmployeeSecondaryInfo secondaryInfo;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experience> experiences;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
        name = "employee_technical_skills",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "technical_skill_id")
    )
    private Set<TechnicalSkills> technicalSkills = new HashSet<>();

   
}
