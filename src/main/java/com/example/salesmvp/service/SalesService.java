package com.example.salesmvp.service;

import com.example.salesmvp.dto.SalesDTO;
import com.example.salesmvp.dto.SalesResponseDTO;

public interface SalesService {
    SalesResponseDTO processSales(SalesDTO salesDTO);
}
