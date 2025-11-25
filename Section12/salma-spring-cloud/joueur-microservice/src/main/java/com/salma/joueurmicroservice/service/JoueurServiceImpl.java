package com.salma.joueurmicroservice.service;


import com.salma.joueurmicroservice.dto.APIResponseDto;
import com.salma.joueurmicroservice.dto.EquipeDto;
import com.salma.joueurmicroservice.dto.JoueurDto;
import com.salma.joueurmicroservice.entities.Joueur;
import com.salma.joueurmicroservice.repos.JoueurRepository;
import com.salma.joueurmicroservice.service.JoueurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class JoueurServiceImpl implements JoueurService {

    private JoueurRepository joueurRepository;
    private APIClient apiClient;
    //private WebClient webClient;

    @Override
    public APIResponseDto getJoueurById(Long id) {
        Joueur joueur = joueurRepository.findById(id).get();

        /*EquipeDto equipeDto = webClient.get()
                .uri("http://localhost:8081/api/equipes/" +
                        joueur.getEqCode())
                .retrieve()
                .bodyToMono(EquipeDto.class)
                .block();*/
        EquipeDto equipeDto = apiClient.getEqByCode(joueur.getEqCode());
        String dname;
        if(equipeDto == null)
            dname="NOT AVAILABLE";
        else
            dname=equipeDto.getEQName();
         JoueurDto joueurDto = new JoueurDto(
                joueur.getId(),
                joueur.getName(),
                joueur.getNumber(),
                joueur.getEqCode(),
                dname
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setJoueurDto(joueurDto);
        apiResponseDto.setEquipeDto(equipeDto);

        return apiResponseDto;

    }
}
