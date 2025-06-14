package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LoyaltyDetailDto {

    @JacksonXmlProperty(isAttribute = true, localName = "LoyaltyType")
    private String loyaltyType;

    @JacksonXmlProperty(isAttribute = true, localName = "SponsorId")
    private String sponsorId;

    @JacksonXmlProperty(isAttribute = true, localName = "TransactionId")
    private String transactionId;

    @JacksonXmlProperty(isAttribute = true, localName = "LocationId")
    private String locationId;

    @JacksonXmlProperty(localName = "LoyaltyCardId")
    private String loyaltyCardIdElement;

    @JacksonXmlProperty(isAttribute = true, localName = "OfferCode")
    private String offerCode;

    @JacksonXmlProperty(isAttribute = true, localName = "Points")
    private String points;

    // Getter and setter

    public String getLoyaltyType() {
        return loyaltyType;
    }

    public void setLoyaltyType(String loyaltyType) {
        this.loyaltyType = loyaltyType;
    }

    public String getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLoyaltyCardIdElement() {
        return loyaltyCardIdElement;
    }

    public void setLoyaltyCardIdElement(String loyaltyCardIdElement) {
        this.loyaltyCardIdElement = loyaltyCardIdElement;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}

