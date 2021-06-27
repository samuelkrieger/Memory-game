package br.com.samuel.jogomemoria.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.jogomemoria.api.model.request.ScoreRequest;
import br.com.samuel.jogomemoria.api.model.response.ScoreResponse;
import br.com.samuel.jogomemoria.api.persistence.entity.Score;
import br.com.samuel.jogomemoria.api.persistence.repository.ScoreRepository;
import br.com.samuel.jogomemoria.api.service.Mapper;
import br.com.samuel.jogomemoria.api.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	private ScoreRepository repository;
	
	@Autowired
	private Mapper<ScoreRequest, Score> requestmapper;
	
	@Autowired
	private Mapper<Score,ScoreResponse> responsemapper;

	
	@Override
	public Optional<ScoreResponse> get(Long id) {
		return repository.findById(id).map(this.responsemapper::map);
	}
	
	

}
