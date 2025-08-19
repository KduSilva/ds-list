package com.eduardo.ds_list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.ds_list.dto.GameDTO;
import com.eduardo.ds_list.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll() {
        List<GameDTO> gameDTOs = gameService.findAll();
        return gameDTOs;
    }
}
