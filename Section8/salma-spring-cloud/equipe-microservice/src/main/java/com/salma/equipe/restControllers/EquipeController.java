package com.salma.equipe.restControllers;

import com.salma.equipe.config.Configuration;
import com.salma.equipe.dto.EquipeDto;
import com.salma.equipe.service.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/equipes")

public class EquipeController {
    private EquipeService equipeService;

    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;

 public EquipeController(EquipeService equipeService) {
     this.equipeService = equipeService;
 }

    @GetMapping("{code}")
    public ResponseEntity<EquipeDto> getEqByCode(@PathVariable("code")
                                                      String code )
    {
        return  new ResponseEntity<EquipeDto>(
                equipeService.getEquipeByCode(code),
                HttpStatus.OK);
    }

    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }

}