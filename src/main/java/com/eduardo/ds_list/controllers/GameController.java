package com.eduardo.ds_list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.ds_list.dto.GameDTO;
import com.eduardo.ds_list.dto.GameReturnDTO;
import com.eduardo.ds_list.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

  @GetMapping(value = "/{id}")
public GameReturnDTO findById(@PathVariable Long id) {
    GameReturnDTO game = gameService.findById(id).orElseThrow();
    return game;
}



    @GetMapping
    public List<GameDTO> findAll() {
        List<GameDTO> gameDTOs = gameService.findAll();
        return gameDTOs;
    }
}
