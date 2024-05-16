package com.example.demo.enums;

public enum AccountType {
    SAVINGS("SAVINGS"),
    CURRENT("CURRENT");

    private final String accountType;

    AccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }
}
