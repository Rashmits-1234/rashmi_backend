package com.example.demo.enums;

public enum Designation {
	TRAINEE("TRAINEE"),
    MENTOR("MENTOR"),
    DEVELOPER("DEVELOPER"),
    TESTER("TESTER");

    private final String designation;

    Designation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
}
