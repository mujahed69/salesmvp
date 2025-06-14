package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

import java.util.List;

public class SaleDto {

    @JacksonXmlProperty(isAttribute = true, localName = "BusinessGroup")
    private String businessGroup;

    @JacksonXmlProperty(isAttribute = true, localName = "CTRReference")
    private String ctrReference;

    @JacksonXmlProperty(isAttribute = true, localName = "Fulfilment")
    private String fulfilment;

    @JacksonXmlProperty(isAttribute = true, localName = "IssueMachineType")
    private String issueMachineType;

    @JacksonXmlProperty(isAttribute = true, localName = "IssueOffice")
    private String issueOffice;

    @JacksonXmlProperty(isAttribute = true, localName = "IssueWindow")
    private String issueWindow;

    @JacksonXmlProperty(isAttribute = true, localName = "SaleIssueDate")
    private String saleIssueDate;

    @JacksonXmlProperty(isAttribute = true, localName = "SaleNumber")
    private String saleNumber;

    @JacksonXmlElementWrapper(localName = "Tickets")
    @JacksonXmlProperty(localName = "Ticket")
    private List<TicketDto> tickets;

    @JacksonXmlElementWrapper(localName = "Sundries")
    @JacksonXmlProperty(localName = "Sundry")
    private List<SundryDto> sundries;

    @JacksonXmlProperty(localName = "NonIssues")
    private Object nonIssues;

    @JacksonXmlElementWrapper(localName = "Payments")
    @JacksonXmlProperty(localName = "Payment")
    private List<PaymentDto> payments;

    @JacksonXmlProperty(localName = "IssueMachine")
    private String issueMachineElement;

    @JacksonXmlElementWrapper(localName = "Refunds")
    @JacksonXmlProperty(localName = "Refund")
    private List<RefundDto> refunds;

    // Getter and setter

    public String getBusinessGroup() {
        return businessGroup;
    }

    public void setBusinessGroup(String businessGroup) {
        this.businessGroup = businessGroup;
    }

    public String getCtrReference() {
        return ctrReference;
    }

    public void setCtrReference(String ctrReference) {
        this.ctrReference = ctrReference;
    }

    public String getFulfilment() {
        return fulfilment;
    }

    public void setFulfilment(String fulfilment) {
        this.fulfilment = fulfilment;
    }

    public String getIssueMachineType() {
        return issueMachineType;
    }

    public void setIssueMachineType(String issueMachineType) {
        this.issueMachineType = issueMachineType;
    }

    public String getIssueOffice() {
        return issueOffice;
    }

    public void setIssueOffice(String issueOffice) {
        this.issueOffice = issueOffice;
    }

    public String getIssueWindow() {
        return issueWindow;
    }

    public void setIssueWindow(String issueWindow) {
        this.issueWindow = issueWindow;
    }

    public String getSaleIssueDate() {
        return saleIssueDate;
    }

    public void setSaleIssueDate(String saleIssueDate) {
        this.saleIssueDate = saleIssueDate;
    }

    public String getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber;
    }

    public List<TicketDto> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketDto> tickets) {
        this.tickets = tickets;
    }

    public List<SundryDto> getSundries() {
        return sundries;
    }

    public void setSundries(List<SundryDto> sundries) {
        this.sundries = sundries;
    }

    public Object getNonIssues() {
        return nonIssues;
    }

    public void setNonIssues(Object nonIssues) {
        this.nonIssues = nonIssues;
    }

    public List<PaymentDto> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentDto> payments) {
        this.payments = payments;
    }

    public String getIssueMachineElement() {
        return issueMachineElement;
    }

    public void setIssueMachineElement(String issueMachineElement) {
        this.issueMachineElement = issueMachineElement;
    }

    public List<RefundDto> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<RefundDto> refunds) {
        this.refunds = refunds;
    }
}
