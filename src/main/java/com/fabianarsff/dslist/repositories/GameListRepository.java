package com.fabianarsff.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabianarsff.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
		
}
