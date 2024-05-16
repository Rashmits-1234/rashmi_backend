package com.example.demo.enums;

public enum Education {
    BACHELORS("BACHELORS"),
    MASTERS("MASTERS");
  
    private final String education;

    Education(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }
}
