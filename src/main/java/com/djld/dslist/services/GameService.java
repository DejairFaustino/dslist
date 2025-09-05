package com.djld.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djld.dslist.dto.GameDTO;
import com.djld.dslist.dto.GameMinDTO;
import com.djld.dslist.entities.Game;
import com.djld.dslist.projections.GameMinProjection;
import com.djld.dslist.repositories.GameRepository;

@Service //registrando/Injetando essa classe como sendo um componente do sistema no frameword Spring
public class GameService {

    @Autowired
    private GameRepository gameRepository; //Injetando uma instância do GameRepository para que seja possível buscar as consultas

    @Transactional(readOnly = true) // A inserção dessa anotation Sprning em todos os métodos de serviços é um  boa pratica para garantir que o banco de dados vai obedecer aos processo de transações
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        /*Forma padrão de carregar o resultado inserida apenas para fins didáticos
        GameDTO dto = new GameDTO(result);
        return dto;*/
        //FORMA SIMPLES DE REALIZA A MESMA CHAMADA
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        /*Forma padrão de carregar o resultado inserida apenas para fins didáticos
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;*/
        //FORMA SIMPLES DE REALIZA A MESMA CHAMADA
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        /*Forma padrão de carregar o resultado inserida apenas para fins didáticos
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;*/
        //FORMA SIMPLES DE REALIZA A MESMA CHAMADA
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
