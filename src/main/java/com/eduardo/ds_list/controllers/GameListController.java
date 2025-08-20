package com.eduardo.ds_list.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.ds_list.dto.GameListDTO;
import com.eduardo.ds_list.services.GameListService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/lists") // Define a rota base da API para este controlador
public class GameListController {


    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll()  {
        return gameListService.findAll();
    }
    
    
}
