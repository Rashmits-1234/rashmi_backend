package com.example.demo.enums;

public enum ContactType {
	EMAIL("EMAIL"),
    PHONE("PHONE"),
    FAX("FAX");


    private final String contactType;

    ContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactType() {
        return contactType;
    }
}
