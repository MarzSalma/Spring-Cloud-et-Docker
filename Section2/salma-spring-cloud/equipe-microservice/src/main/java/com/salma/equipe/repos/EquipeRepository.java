package com.salma.equipe.repos;

import com.salma.equipe.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe,
        Long> {
    Equipe findByDepCode(String code);
}