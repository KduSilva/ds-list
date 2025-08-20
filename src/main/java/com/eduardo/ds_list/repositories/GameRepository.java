package com.eduardo.ds_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eduardo.ds_list.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    // Métodos de consulta adicionais podem ser definidos aqui, se necessário
    // métodos que usam gameRepository...


}
