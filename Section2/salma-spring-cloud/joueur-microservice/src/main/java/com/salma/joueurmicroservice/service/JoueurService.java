package com.salma.joueurmicroservice.service;

import com.salma.joueurmicroservice.dto.JoueurDto;

public interface JoueurService {
    JoueurDto getJoueurById(Long id);
}
