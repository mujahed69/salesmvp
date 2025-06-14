package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TicketDetailsDto {

    @JacksonXmlProperty(isAttribute = true, localName = "CarnetLayout")
    private String carnetLayout;

    @JacksonXmlProperty(isAttribute = true, localName = "MandatoryReservation")
    private String mandatoryReservation;

    @JacksonXmlProperty(isAttribute = true, localName = "OutwardDate")
    private String outwardDate;

    // Getters & Setters

    public String getCarnetLayout() {
        return carnetLayout;
    }

    public void setCarnetLayout(String carnetLayout) {
        this.carnetLayout = carnetLayout;
    }

    public String getMandatoryReservation() {
        return mandatoryReservation;
    }

    public void setMandatoryReservation(String mandatoryReservation) {
        this.mandatoryReservation = mandatoryReservation;
    }

    public String getOutwardDate() {
        return outwardDate;
    }

    public void setOutwardDate(String outwardDate) {
        this.outwardDate = outwardDate;
    }
}
