package com.projetopessoal.projetolista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopessoal.projetolista.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
