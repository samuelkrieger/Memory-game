package br.com.samuel.jogomemoria.api.service.mapper.response;

import org.springframework.stereotype.Component;

import br.com.samuel.jogomemoria.api.model.response.ScoreResponse;
import br.com.samuel.jogomemoria.api.persistence.entity.Score;
import br.com.samuel.jogomemoria.api.service.Mapper;
@Component
public class ScoreResponseMapper implements Mapper<Score, ScoreResponse>{

	@Override
	public ScoreResponse map(Score input) {
		 if(input == null){
	            return null;
	        }

	        ScoreResponse  score = new ScoreResponse();
	        score.setName(input.getName());
	        score.setValue(input.getValue());
	       
	      
	     

	        return score;
	    } 

}
