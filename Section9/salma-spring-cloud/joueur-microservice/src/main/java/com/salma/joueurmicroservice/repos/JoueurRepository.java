package com.salma.joueurmicroservice.repos;

import com.salma.joueurmicroservice.entities.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
