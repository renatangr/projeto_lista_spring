package com.projetopessoal.projetolista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopessoal.projetolista.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
