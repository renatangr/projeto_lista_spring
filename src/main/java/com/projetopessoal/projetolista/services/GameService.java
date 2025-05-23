package com.projetopessoal.projetolista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetopessoal.projetolista.dto.GameDTO;
import com.projetopessoal.projetolista.dto.GameMinDTO;
import com.projetopessoal.projetolista.entities.Game;
import com.projetopessoal.projetolista.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; // Injetando uma instância do GameRepository para que o GameService possa chamar a camada de Repository neste componente
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
