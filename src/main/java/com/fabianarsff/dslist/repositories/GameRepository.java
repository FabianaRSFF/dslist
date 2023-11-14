package com.fabianarsff.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabianarsff.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
