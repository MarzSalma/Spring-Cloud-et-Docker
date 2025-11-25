package com.salma.joueurmicroservice.service;

import com.salma.joueurmicroservice.dto.EquipeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8081", value = "EQUIPE")
@FeignClient(name = "EQUIPES-MS")
//@FeignClient(name = "EQUIPES-MS", fallback = DeptFallBack.class)
public interface APIClient {
    @GetMapping("/api/equipes/{equipe-code}")
    EquipeDto getEqByCode(@PathVariable("equipe-code") String equipeCode);
}