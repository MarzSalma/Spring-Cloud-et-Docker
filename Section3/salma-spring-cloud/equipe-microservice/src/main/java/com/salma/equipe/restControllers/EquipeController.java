package com.salma.equipe.restControllers;

import com.salma.equipe.dto.EquipeDto;
import com.salma.equipe.service.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/equipes")
@AllArgsConstructor
public class EquipeController {
    private EquipeService equipeService;

    @GetMapping("{code}")
    public ResponseEntity<EquipeDto> getEqByCode(@PathVariable("code")
                                                      String code )
    {
        return  new ResponseEntity<EquipeDto>(
                equipeService.getEquipeByCode(code),
                HttpStatus.OK);
    }
}