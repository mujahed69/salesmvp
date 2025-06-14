package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ParametersDto {

    @JacksonXmlProperty(localName = "ID")
    private String id;

    @JacksonXmlProperty(localName = "Sale")
    private SaleDto sale;

    // Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SaleDto getSale() {
        return sale;
    }

    public void setSale(SaleDto sale) {
        this.sale = sale;
    }
}

