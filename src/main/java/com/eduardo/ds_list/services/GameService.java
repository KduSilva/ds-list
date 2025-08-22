package com.eduardo.ds_list.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.eduardo.ds_list.dto.GameDTO;
import com.eduardo.ds_list.dto.GameReturnDTO;
import com.eduardo.ds_list.entities.Game;
import com.eduardo.ds_list.projections.GameProjection;
import com.eduardo.ds_list.repositories.GameRepository;

@Service
public class GameService {

    private final GameRepository gameRepository;

    
  

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }


    public Optional<GameReturnDTO> findById(Long id) {
    return gameRepository.findById(id).map(GameReturnDTO::new);
}

    public List<GameDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gameDTOs = games.stream().map(x -> new GameDTO(x)).toList();
        return gameDTOs;
        
    }

    public List<GameDTO> findByList(Long listId) {
        List<Game> games = gameRepository.findAll();
        List<GameProjection> gameDTOs = gameRepository.searchByList(listId);
        return gameDTOs.stream().map(x -> new GameDTO(x)).toList();
        
    }
}
