package com.djld.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djld.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}