package br.com.samuel.jogomemoria.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.jogomemoria.api.persistence.entity.Score;
import br.com.samuel.jogomemoria.api.persistence.repository.ScoreRepository;

@Service

public class ScoreService {
	
	@Autowired
	private ScoreRepository repository;
	
	
	
	
	public Optional<Score> get(Long id) {
		return repository.findById(id);
	}
}
