package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "technical_skills")
public class TechnicalSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String skillType;
    private String skillRating;
    private LocalDate yearOfExperience;

    @ManyToMany(mappedBy = "technicalSkills")
    private Set<EmployeePrimaryInfo> employees = new HashSet<>();

    
}
