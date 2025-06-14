package com.example.salesmvp.controller;

import com.example.salesmvp.dto.SalesDTO;
import com.example.salesmvp.dto.SalesResponseDTO;
import com.example.salesmvp.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @PostMapping (value = "/v2", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<SalesResponseDTO> processSalesXml(@RequestBody SalesDTO salesDTO) {
       return ResponseEntity.ok(salesService.processSales(salesDTO));
    }
}
