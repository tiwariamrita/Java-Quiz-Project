package fr.epita.quizAPI.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.epita.quiz.datamodel.*;
import fr.epita.quiz.services.MCQChoiceDAO;
import fr.epita.quizAPI.resources.MCQChoiceDTO;

@Path("/choice")
@JsonIgnoreProperties("error")
public class MCQChoiceServices {
	
	
	@Inject
	MCQChoiceDAO mcqChoiceDAO;
	
	@POST
	@Path("/addChoice")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response createChoices(@RequestBody List<MCQChoiceDTO> listDTO) {
		
		for (MCQChoiceDTO mcqChoiceDTO : listDTO) {
			
			MCQchoice choice = new MCQchoice();
			choice.setChoice(mcqChoiceDTO.getChoice());
			
			Question question = new Question();
			question.setId(mcqChoiceDTO.getQuestion().getId());
			question.setTitle(mcqChoiceDTO.getQuestion().getTitle());
			
			choice.setQuestion(question);
			choice.setAnswer(mcqChoiceDTO.isValid());
			
			mcqChoiceDAO.create(choice);
			
			mcqChoiceDTO.setId(choice.getCid());
		}
		return null;
	}
	
}