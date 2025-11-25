package com.salma.equipe.service;

import com.salma.equipe.dto.EquipeDto;
import com.salma.equipe.entities.Equipe;
import com.salma.equipe.repos.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EquipeServiceImpl implements EquipeService {

   private EquipeRepository equipeRepository;

    @Override
    public EquipeDto getEquipeByCode(String code) {
        Equipe dep = equipeRepository.findByEqCode(code);
        EquipeDto equipeDto = new EquipeDto(
                dep.getId(),
                dep.getEqName(),
                dep.getEqCode()
        );
        return equipeDto;
    }
}

