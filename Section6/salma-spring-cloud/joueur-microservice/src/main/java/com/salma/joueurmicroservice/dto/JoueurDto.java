package com.salma.joueurmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoueurDto {
    private Long id;
    private String Name;
    private int Number;
    private String eqCode;
    private String EqName;
}
