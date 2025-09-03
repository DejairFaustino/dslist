package com.djld.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djld.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}