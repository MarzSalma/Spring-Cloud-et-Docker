package com.salma.joueurmicroservice.restControllers;

import com.salma.joueurmicroservice.dto.JoueurDto;
import com.salma.joueurmicroservice.service.JoueurService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/joueurs")
@AllArgsConstructor
public class JoueurController {

    private JoueurService joueurService;

    @GetMapping("{id}")
    public ResponseEntity<JoueurDto> getJoueurById(@PathVariable("id") Long id) {
        return new ResponseEntity<JoueurDto>(
                joueurService.getJoueurById(id),
                HttpStatus.OK
        );
    }
}