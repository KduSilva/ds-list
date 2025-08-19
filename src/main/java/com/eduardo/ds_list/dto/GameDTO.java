package com.eduardo.ds_list.dto;

import com.eduardo.ds_list.entities.Game;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private Double score;
    private String imgUrl;
    private String shortDescription;

    public GameDTO() {

    }

    public GameDTO(Game Entity) {
        id = Entity.getId();
        title = Entity.getTitle();
        year = Entity.getYear();
        genre = Entity.getGenre();
        score = Entity.getScore();
        imgUrl = Entity.getImgUrl();
        shortDescription = Entity.getShortDescription();
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

    public String getGenre() {
        return genre;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

}
