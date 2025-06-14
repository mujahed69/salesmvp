package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TicketDto {

    @JacksonXmlProperty(isAttribute = true, localName = "ApplicationTicketId")
    private String applicationTicketId;

    @JacksonXmlProperty(isAttribute = true, localName = "Class")
    private String ticketClass;

    @JacksonXmlProperty(isAttribute = true, localName = "Destination")
    private String destination;

    @JacksonXmlProperty(localName = "TicketDetails")
    private TicketDetailsDto ticketDetails;

    @JacksonXmlProperty(localName = "LoyaltyDetail")
    private LoyaltyDetailDto loyaltyDetail;

    @JacksonXmlProperty(localName = "IssueDate")
    private String issueDate;

    @JacksonXmlProperty(localName = "TransactionNumber")
    private String transactionNumber;

    @JacksonXmlProperty(localName = "TicketUsage")
    private Object ticketUsage;

    // getter and setter


    public String getApplicationTicketId() {
        return applicationTicketId;
    }

    public void setApplicationTicketId(String applicationTicketId) {
        this.applicationTicketId = applicationTicketId;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TicketDetailsDto getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(TicketDetailsDto ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    public LoyaltyDetailDto getLoyaltyDetail() {
        return loyaltyDetail;
    }

    public void setLoyaltyDetail(LoyaltyDetailDto loyaltyDetail) {
        this.loyaltyDetail = loyaltyDetail;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Object getTicketUsage() {
        return ticketUsage;
    }

    public void setTicketUsage(Object ticketUsage) {
        this.ticketUsage = ticketUsage;
    }
}


