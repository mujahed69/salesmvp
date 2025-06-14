package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AdminFeeDto {

    @JacksonXmlProperty(isAttribute = true, localName = "Amount")
    private String amount;

    @JacksonXmlProperty(isAttribute = true, localName = "AdminFeeType")
    private String adminFeeType;

    // Getters & Setters

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAdminFeeType() {
        return adminFeeType;
    }

    public void setAdminFeeType(String adminFeeType) {
        this.adminFeeType = adminFeeType;
    }
}

