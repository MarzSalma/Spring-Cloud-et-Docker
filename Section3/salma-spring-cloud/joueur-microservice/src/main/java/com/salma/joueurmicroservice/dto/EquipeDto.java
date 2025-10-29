package com.salma.joueurmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipeDto {
    private Long id;
    private String EQName;
    private String EqCode;
}
