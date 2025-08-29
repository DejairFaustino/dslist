package com.djld.dslist.dto;

import com.djld.dslist.entities.Game;

//Classe
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year; 
    private String imgUrl;
    private String shortDescription;

    //Construtor sem argumentos
    public GameMinDTO(){
    }

    //Construtor que recebe os argumentos a partir da entidade Game, somente
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    
}