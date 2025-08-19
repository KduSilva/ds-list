package com.eduardo.ds_list.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.eduardo.ds_list.dto.GameDTO;
import com.eduardo.ds_list.entities.Game;
import com.eduardo.ds_list.repositories.GameRepository;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gameDTOs = games.stream().map(x -> new GameDTO(x)).toList();
        return gameDTOs;
        // return gameRepository.findAll().stream().map(GameDTO::new).collect(Collectors.toList());
    }
}
