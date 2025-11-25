package com.salma.joueurmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private JoueurDto joueurDto;
    private EquipeDto equipeDto;
}
