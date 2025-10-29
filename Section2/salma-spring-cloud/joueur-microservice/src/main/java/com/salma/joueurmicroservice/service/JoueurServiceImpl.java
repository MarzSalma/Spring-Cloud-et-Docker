package com.salma.joueurmicroservice.service;


import com.salma.joueurmicroservice.dto.JoueurDto;
import com.salma.joueurmicroservice.entities.Joueur;
import com.salma.joueurmicroservice.repos.JoueurRepository;
import com.salma.joueurmicroservice.service.JoueurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class JoueurServiceImpl implements JoueurService {

    private JoueurRepository joueurRepository;

    @Override
    public JoueurDto getJoueurById(Long id) {
        Joueur joueur = joueurRepository.findById(id).get();
        return new JoueurDto(
                joueur.getId(),
                joueur.getName(),
                joueur.getNumber()
        );
    }
}
