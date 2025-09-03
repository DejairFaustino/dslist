package com.djld.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djld.dslist.dto.GameListDTO;
import com.djld.dslist.entities.GameList;
import com.djld.dslist.repositories.GameListRepository;

@Service //registrando/Injetando essa classe como sendo um componente do sistema no frameword Spring
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository; //Injetando uma instância do GameRepository para que seja possível buscar as consultas

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        /*Forma padrão de carregar o resultado inserida apenas para fins didáticos
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;*/
        //FORMA SIMPLES DE REALIZA A MESMA CHAMADA
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
