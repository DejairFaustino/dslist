package com.djld.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djld.dslist.dto.GameMinDTO;
import com.djld.dslist.entities.Game;
import com.djld.dslist.repositories.GameRepository;

@Service //registrando/Injetando essa classe como sendo um componente do sistema no frameword Spring
public class GameService {

    @Autowired
    private GameRepository gameRepository; //Injetando uma instância do GameRepository para que seja possível buscar as consultas

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        //FORMA DIDÁTICA DE CHAMAR O RESULTADO
        /*List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;*/
        //FORMA SIMPLES DE REALIZA A MESMA CHAMADA
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
