package com.fabianarsff.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabianarsff.dslist.dto.GameDTO;
import com.fabianarsff.dslist.dto.GameMinDTO;
import com.fabianarsff.dslist.entities.Game;
import com.fabianarsff.dslist.projections.GameMinProjection;
import com.fabianarsff.dslist.repositories.GameRepository;



@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
			Game result = gameRepository.findById(id).get();
			return new GameDTO(result);
			
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
	
	
}
