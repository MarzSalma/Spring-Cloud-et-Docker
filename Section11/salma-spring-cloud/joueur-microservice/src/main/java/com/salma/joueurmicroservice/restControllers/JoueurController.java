package com.salma.joueurmicroservice.restControllers;

import com.salma.joueurmicroservice.config.Configuration;
import com.salma.joueurmicroservice.dto.APIResponseDto;
import com.salma.joueurmicroservice.dto.JoueurDto;
import com.salma.joueurmicroservice.service.JoueurService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    Configuration configuration;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getJoueurById(@PathVariable("id") Long id) {
        return new ResponseEntity<APIResponseDto>(
                joueurService.getJoueurById(id),
                HttpStatus.OK
        );
    }
    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}