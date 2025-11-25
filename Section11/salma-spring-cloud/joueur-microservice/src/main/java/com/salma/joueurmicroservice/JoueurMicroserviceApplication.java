package com.salma.joueurmicroservice;

import com.salma.joueurmicroservice.entities.Joueur;
import com.salma.joueurmicroservice.repos.JoueurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients

public class JoueurMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoueurMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(JoueurRepository joueurRepository) {
        return args -> {
            joueurRepository.save(Joueur.builder()
                    .Name("Mbappe")
                    .Number(10)
                    .eqCode("RM")
                    .build());


        };
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
