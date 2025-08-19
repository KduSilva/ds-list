package com.eduardo.ds_list.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import com.eduardo.ds_list.dto.GameDTO;

import com.eduardo.ds_list.repositories.GameRepository;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameDTO> findAll() {
        return gameRepository.findAll().stream().map(GameDTO::new).collect(Collectors.toList());
    }
}
