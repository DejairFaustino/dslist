package com.djld.dslist.dto;

import com.djld.dslist.entities.Game;
import com.djld.dslist.projections.GameMinProjection;

//Classe
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year; 
    private String imgUrl;
    private String shortDescription;
    private Integer position;

    //Construtor sem argumentos
    public GameMinDTO(){
    }

    //Construtor do GameMinDTO que recebe os argumentos a partir da entidade Game.
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    // //Construtor do GameMinDTO que recebe os argumentos a partir da projection GameMinProjection.
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
        position = projection.getPosition();
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

    public Integer getPosition() {
        return position;
    }

    
}