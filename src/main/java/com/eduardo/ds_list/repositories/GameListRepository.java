package com.eduardo.ds_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.eduardo.ds_list.entities.GameList;

import org.springframework.transaction.annotation.Transactional;
// import jakarta.transaction.Transactional;


public interface GameListRepository extends JpaRepository<GameList, Long> {
    
@Modifying
@Transactional
@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

    // métodos que usam gameListRepository...

}
