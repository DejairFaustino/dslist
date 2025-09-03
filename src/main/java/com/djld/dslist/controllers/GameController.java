package com.djld.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djld.dslist.dto.GameDTO;
import com.djld.dslist.dto.GameMinDTO;
import com.djld.dslist.services.GameService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController // Configurando essa classe para ser um controlador
@RequestMapping(value = "/games") // maapeando o recurso que neste caso é "games", ou seja, mapeamento do caminho para a API (end point) carregar todos os resultados
public class GameController {

    @Autowired
    private GameService gameService; // injetando a camada de serviços nesta classe 

    @GetMapping(value = "/{id}") // mapeando o recurso que neste caso é "/id", ou seja, mapeamento do caminho para a API (end point) carregar o resultado a partir do "id" informado
    public GameDTO findById(@PathVariable Long id) { // o "@PathVariable" faz com que o "id" do argumento case com o "{id}" da requisição
        GameDTO result = gameService.findById(id);
        return result;
    }
    
    @GetMapping
    public List<GameMinDTO> findAll() { //gerando o resultado que será carregado com a requsição "/game"
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
