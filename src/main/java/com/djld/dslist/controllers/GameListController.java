package com.djld.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djld.dslist.dto.GameListDTO;
import com.djld.dslist.services.GameListService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController // Configurando essa classe para ser um controlador
@RequestMapping(value = "/lists") // maapeando o recurso que neste caso é "games", ou seja, mapeamento do caminho para a API (end point) carregar todos os resultados
public class GameListController {

    @Autowired
    private GameListService gameListService; // injetando a camada de serviços nesta classe 


    @GetMapping
    public List<GameListDTO> findAll() { //gerando o resultado que será carregado com a requsição "/game"
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
