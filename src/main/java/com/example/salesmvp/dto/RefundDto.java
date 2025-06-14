package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

import java.util.List;

public class RefundDto {

    @JacksonXmlProperty(isAttribute = true, localName = "RefundReference")
    private String refundReferenceAttr;


    @JacksonXmlProperty(localName = "Surname")
    private String surname;

    @JacksonXmlProperty(localName = "Postcode")
    private String postcode;

    @JacksonXmlProperty(localName = "RefundStatus")
    private String refundStatus;

    @JacksonXmlProperty(localName = "AdminFee")
    private AdminFeeDto adminFee;

    @JacksonXmlElementWrapper(localName = "RefundItems")
    @JacksonXmlProperty(localName = "RefundItem")
    private List<RefundItemDto> refundItems;

    @JacksonXmlElementWrapper(localName = "RefundPayments")
    @JacksonXmlProperty(localName = "Payment")
    private List<PaymentDto> refundPayments;

    // Getters & Setters

    public String getRefundReferenceAttr() {
        return refundReferenceAttr;
    }

    public void setRefundReferenceAttr(String refundReferenceAttr) {
        this.refundReferenceAttr = refundReferenceAttr;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public AdminFeeDto getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(AdminFeeDto adminFee) {
        this.adminFee = adminFee;
    }

    public List<RefundItemDto> getRefundItems() {
        return refundItems;
    }

    public void setRefundItems(List<RefundItemDto> refundItems) {
        this.refundItems = refundItems;
    }

    public List<PaymentDto> getRefundPayments() {
        return refundPayments;
    }

    public void setRefundPayments(List<PaymentDto> refundPayments) {
        this.refundPayments = refundPayments;
    }
}

