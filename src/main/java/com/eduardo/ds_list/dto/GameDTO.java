package com.eduardo.ds_list.dto;

import com.eduardo.ds_list.entities.Game;


public record GameDTO(
    Long id,
    String title,
    Integer year,
    String genre,
    String platform,
    Double score,
    String imgUrl,
    String shortDescription,
    String longDescription) {
        public GameDTO(Game entity){
            
            this(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getGenre(),
                entity.getPlatforms(),
                entity.getScore(),
                entity.getImgUrl(),
                entity.getShortDescription(),
                entity.getLongDescription()
            );
        }
}
// public class GameDTO {

//     private Long id;
//     private String title;
//     private Integer year;
//     private String genre;
//     private Double score;
//     private String imgUrl;
//     private String shortDescription;
//     private String longDescription;

//     public GameDTO() {

//     }

//     public GameDTO(Game entity) {
//         this.id = entity.getId();
//         this.title = entity.getTitle();
//         this.year = entity.getYear();
//         this.genre = entity.getGenre();
//         this.score = entity.getScore();
//         this.imgUrl = entity.getImgUrl();
//         this.shortDescription = entity.getShortDescription();
//         this.longDescription = entity.getLongDescription();

//     }

//     public Long getId() {
//         return id;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public Integer getYear() {
//         return year;
//     }

//     public String getGenre() {
//         return genre;
//     }

//     public Double getScore() {
//         return score;
//     }

//     public String getImgUrl() {
//         return imgUrl;
//     }

//     public String getShortDescription() {
//         return shortDescription;
//     }

//     public String getLongDescription() {
//         return longDescription;
//     }

// }
