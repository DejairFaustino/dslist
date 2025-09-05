package com.djld.dslist.projections;

public interface GameMinProjection {
    // métodos de cada daoo que a Query da GameRepository estiver retornando
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
    
}
