package com.eduardo.ds_list.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "tb_belonging")
public class Belonging {
    
    @EmbeddedId
    private BelongingKeyId id = new BelongingKeyId();

    @Column(name = "position")
    Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList gameList, Integer position){
        // this.id = new BelongingKeyId(game, gameList);
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }

    public BelongingKeyId getId() {
        return id;
    }

    public void setId(BelongingKeyId id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Belonging other = (Belonging) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

    
}
