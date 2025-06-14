package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SundryDto {

    @JacksonXmlProperty(isAttribute = true, localName = "Amount")
    private String amount;

    @JacksonXmlProperty(localName = "IssueDate")
    private String issueDate;

    @JacksonXmlProperty(localName = "TransactionNumber")
    private String transactionNumber;

    // Getters & Setters

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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
}

