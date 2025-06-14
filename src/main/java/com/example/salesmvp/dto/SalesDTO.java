package com.example.salesmvp.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Request")
public class SalesDTO {

    @JacksonXmlProperty(isAttribute = true, localName = "MachineType")
    private int machineType;

    @JacksonXmlProperty(isAttribute = true, localName = "Machine")
    private int machine;

    @JacksonXmlProperty(isAttribute = true, localName = "UserID")
    private int userId;

    @JacksonXmlProperty(localName = "Parameters")
    private ParametersDto parameters;

    // Getters and setters
    public int getMachineType() { return machineType; }
    public void setMachineType(int machineType) { this.machineType = machineType; }

    public int getMachine() { return machine; }
    public void setMachine(int machine) { this.machine = machine; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public ParametersDto getParameters() {
        return parameters;
    }

    public void setParameters(ParametersDto parameters) {
        this.parameters = parameters;
    }
}