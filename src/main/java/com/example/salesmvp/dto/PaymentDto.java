package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PaymentDto {

    @JacksonXmlProperty(isAttribute = true, localName = "Amount")
    private String amount;

    @JacksonXmlProperty(isAttribute = true, localName = "AuthCode")
    private String authCode;

    @JacksonXmlProperty(isAttribute = true, localName = "MOP")
    private String mop;

    @JacksonXmlProperty(isAttribute = true, localName = "MaskedPAN")
    private String maskedPAN;

    @JacksonXmlProperty(isAttribute = true, localName = "PANHandle")
    private String panHandle;

    @JacksonXmlProperty(isAttribute = true, localName = "ExpiryDate")
    private String expiryDate;

    // Getters & Setters

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getMop() {
        return mop;
    }

    public void setMop(String mop) {
        this.mop = mop;
    }

    public String getMaskedPAN() {
        return maskedPAN;
    }

    public void setMaskedPAN(String maskedPAN) {
        this.maskedPAN = maskedPAN;
    }

    public String getPanHandle() {
        return panHandle;
    }

    public void setPanHandle(String panHandle) {
        this.panHandle = panHandle;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
