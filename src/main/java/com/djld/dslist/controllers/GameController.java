package com.djld.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djld.dslist.dto.GameMinDTO;
import com.djld.dslist.services.GameService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController // Configurando essa classe para ser um controlador
@RequestMapping(value = "/games") // maapeando o recurso que neste caso é "games", ou seja, mapeamento do caminho para a API (end point)
public class GameController {

    @Autowired
    private GameService gameService; // injetando a camada de serviços nesta classe 

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
    
}
