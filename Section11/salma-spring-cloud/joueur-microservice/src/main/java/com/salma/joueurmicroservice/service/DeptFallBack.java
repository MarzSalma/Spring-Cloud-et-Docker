package com.salma.joueurmicroservice.service;

import com.salma.joueurmicroservice.dto.EquipeDto;
import org.springframework.stereotype.Component;

@Component
public class DeptFallBack implements APIClient {
    @Override
    public EquipeDto getEqByCode(String equipeCode) {
        return null;
    }
}