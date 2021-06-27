package br.com.samuel.jogomemoria.api.service.mapper.request;

import org.springframework.stereotype.Component;

import br.com.samuel.jogomemoria.api.model.request.ScoreRequest;
import br.com.samuel.jogomemoria.api.persistence.entity.Score;
import br.com.samuel.jogomemoria.api.service.Mapper;

@Component
public class ScoreRequestMapper implements Mapper<ScoreRequest, Score>{

	@Override
	public Score map(ScoreRequest input) {
		if(input == null){
            return null;
        }

        Score score = new Score();
        score.setName(input.getName());
        score.setValue(input.getValue());
        
      
     

        return score;
    }
	}
	


