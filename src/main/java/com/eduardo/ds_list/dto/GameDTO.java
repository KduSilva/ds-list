package com.eduardo.ds_list.dto;

import com.eduardo.ds_list.entities.Game;
import com.eduardo.ds_list.projections.GameProjection;


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

       public GameDTO(GameProjection projection) {
    this(
        projection.getId(),
        projection.getTitle(),
        projection.getYear(),
        projection.getGenre(),
        projection.getPlatform(),
        projection.getScore(),
        projection.getImgUrl(),
        projection.getShortDescription(),
        projection.getLongDescription()
    );
}
    }

   





