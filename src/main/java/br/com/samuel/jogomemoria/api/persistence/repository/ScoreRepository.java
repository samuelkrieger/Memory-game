package br.com.samuel.jogomemoria.api.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samuel.jogomemoria.api.persistence.entity.Score;

public interface ScoreRepository extends JpaRepository<Score, Long>  {

}
