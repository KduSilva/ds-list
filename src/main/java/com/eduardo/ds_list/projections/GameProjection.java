package com.eduardo.ds_list.projections;

public interface GameProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getGenre();
    String getPlatform();
    Double getScore();
    String getImgUrl();
    String getShortDescription();
    String getLongDescription();
}
