package com.fabianarsff.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabianarsff.dslist.dto.GameListDTO;
import com.fabianarsff.dslist.dto.GameMinDTO;
import com.fabianarsff.dslist.services.GameListService;
import com.fabianarsff.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
		
		@Autowired 
		private GameListService gameListService;
		
		@Autowired
		private GameService gameService;
	

		@GetMapping
		public List<GameListDTO> findAll1() {
			List<GameListDTO> result = gameListService.findAll(); 
			return result;
	}
		
		@GetMapping(value = "/{listId}/games")
		public List<GameMinDTO> findByList(@PathVariable long listId) {
			List<GameMinDTO> result = gameService.findByList(listId); 
			return result;
	}
	
	
	
}