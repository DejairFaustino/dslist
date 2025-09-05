package com.djld.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djld.dslist.dto.GameListDTO;
import com.djld.dslist.dto.GameMinDTO;
import com.djld.dslist.services.GameListService;
import com.djld.dslist.services.GameService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController // Configurando essa classe para ser um controlador
@RequestMapping(value = "/lists") // maapeando o recurso que neste caso é "games", ou seja, mapeamento do caminho para a API (end point) carregar todos os resultados
public class GameListController {

    @Autowired
    private GameListService gameListService; // injetando a camada de serviços nesta classe 

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameListDTO> findAll() { //gerando o resultado que será carregado com a requsição "/game"
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

        @GetMapping(value = "/{listId}/games")
        public List<GameMinDTO> findByList(@PathVariable Long listId) { //gerando o resultado que será carregado com a requsição "/game"
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
    
}
