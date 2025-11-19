package com.salma.joueurmicroservice.service;

import com.salma.joueurmicroservice.dto.APIResponseDto;
import com.salma.joueurmicroservice.dto.JoueurDto;

public interface JoueurService {
    APIResponseDto getJoueurById(Long id);
}
