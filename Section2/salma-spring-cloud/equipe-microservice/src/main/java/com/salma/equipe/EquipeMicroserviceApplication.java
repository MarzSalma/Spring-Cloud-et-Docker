package com.salma.equipe;

import com.salma.equipe.entities.Equipe;
import com.salma.equipe.repos.EquipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EquipeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipeMicroserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EquipeRepository equipeRepository) {
		return args -> {
			equipeRepository.save(Equipe.builder()
					.EqName("Real Madrid")
					.EqCode("RM")
					.build());
			equipeRepository.save(Equipe.builder()
					.EqName("Barca")
					.EqCode("FCB")
					.build());
		};
	}

}
