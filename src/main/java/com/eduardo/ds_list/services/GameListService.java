package com.eduardo.ds_list.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.ds_list.dto.GameListDTO;
import com.eduardo.ds_list.entities.GameList;
import com.eduardo.ds_list.repositories.GameListRepository;

@Service
public class GameListService {
    
    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    public List<GameListDTO> findAll() {
        List<GameList>  gameList = gameListRepository.findAll();
        return gameList.stream().map(GameListDTO::new).toList();

    }
}
