package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RefundItemDto {

    @JacksonXmlProperty(isAttribute = true, localName = "Type")
    private String type;

    @JacksonXmlProperty(isAttribute = true, localName = "RefundAmount")
    private String refundAmount;

    @JacksonXmlProperty(isAttribute = true, localName = "ApplicationTicketId")
    private String applicationTicketId;

    // Getters & Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getApplicationTicketId() {
        return applicationTicketId;
    }

    public void setApplicationTicketId(String applicationTicketId) {
        this.applicationTicketId = applicationTicketId;
    }
}
