package com.eduardo.ds_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eduardo.ds_list.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long> {
    


    // métodos que usam gameListRepository...

}
