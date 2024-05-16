package com.example.demo.enums;

public enum MaritalStatus {
    SINGLE("SINGLE"),
    MARRIED("MARRIED"),
    DIVORCED("DIVORCED");

    private final String maritalStatus;

    MaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
