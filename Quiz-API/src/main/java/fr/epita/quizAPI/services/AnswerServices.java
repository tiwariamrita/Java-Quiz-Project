package fr.epita.quizAPI.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.epita.quiz.datamodel.*;
import fr.epita.quiz.services.AnswerDAO;
import fr.epita.quizAPI.resources.AnswerDTO;

@Path("/choice")
@JsonIgnoreProperties("error")
public class AnswerServices {
	
	
	@Inject
	AnswerDAO aDAO;
	
	@POST
	@Path("/answer")
	
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response createChoices(@RequestBody List<AnswerDTO> listDTO) {
		
		return null;
	}
	
}
