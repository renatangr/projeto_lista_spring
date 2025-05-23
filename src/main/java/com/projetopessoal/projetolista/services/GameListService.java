package com.projetopessoal.projetolista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetopessoal.projetolista.dto.GameListDTO;
import com.projetopessoal.projetolista.entities.GameList;
import com.projetopessoal.projetolista.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository; // Injetando uma instância do GameRepository para que o GameService possa chamar a camada de Repository neste componente
	

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
