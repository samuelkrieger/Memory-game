package br.com.samuel.jogomemoria.api.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.samuel.jogomemoria.api.model.response.ScoreResponse;

@Service

public interface  ScoreService {
	
	Optional<ScoreResponse> get(Long id);
	
	
}
