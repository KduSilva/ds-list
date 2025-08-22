package com.eduardo.ds_list.repositories;



import com.eduardo.ds_list.projections.GameProjection;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eduardo.ds_list.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    // Métodos de consulta adicionais podem ser definidos aqui, se necessário
   @Query(nativeQuery = true, value = """
    SELECT tb_game.id,
           tb_game.title,
           tb_game.game_year AS year,
           tb_game.img_url AS imgUrl,
           tb_game.short_description AS shortDescription,
           tb_belonging.position
    FROM tb_game
    INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
    WHERE tb_belonging.list_id = :listId
    ORDER BY tb_belonging.position
    """)
List<GameProjection> searchByList(Long listId);
    // métodos que usam gameRepository...


}
