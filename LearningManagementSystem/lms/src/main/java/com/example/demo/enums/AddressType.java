package com.example.demo.enums;

public enum AddressType {
	PERMANENT("PERMANENT"),
    CURRENT("CURRENT");

    private final String addressType;

    AddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressType() {
        return addressType;
    }
}
