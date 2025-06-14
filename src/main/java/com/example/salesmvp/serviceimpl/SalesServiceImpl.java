package com.example.salesmvp.serviceimpl;

import com.example.salesmvp.dto.SalesDTO;
import com.example.salesmvp.dto.SalesResponseDTO;
import com.example.salesmvp.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService {


    @Override
    public SalesResponseDTO processSales(SalesDTO salesDTO) {
        SalesResponseDTO salesResponse = new SalesResponseDTO();

        // Precess Sales Data
        salesResponse.setSaleId(101L);

        return salesResponse;
    }
}
