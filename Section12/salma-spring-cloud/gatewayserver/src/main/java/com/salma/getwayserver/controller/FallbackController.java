package com.salma.getwayserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class FallbackController {
    @RequestMapping("/contactAdmin")
    public ResponseEntity<String> contactAdmin() {
        return new ResponseEntity<>("An error occurred. Please contact the administrator. !",
                HttpStatus.SERVICE_UNAVAILABLE);
    }
}
