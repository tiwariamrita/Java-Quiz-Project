package fr.epita.quizAPI.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.springframework.web.bind.annotation.RequestBody;

import fr.epita.quiz.datamodel.*;
import fr.epita.quiz.services.*;
import fr.epita.quizAPI.resources.QuestionDTO;

@Path("/Questions")
public class QuestionServices {

	@Inject
	QuestionDAO qDAO;
	
	@Inject
	ExamDAO eDAO;
	
	@Inject
	MCQChoiceDAO mcqCDAO;

	@POST
	@Path("/createQuestion")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response createQuestion(@RequestBody QuestionDTO questionDTO) {

		if (questionDTO.getTitle() == null) {
			return Response.ok(("Empty Question")).build();
		}

		Exam exam = new Exam();

		Question question = new Question();
		question.setTitle(questionDTO.getTitle());

		qDAO.create(question);

		questionDTO.setId(question.getId());
		return Response.status(Status.OK).entity(questionDTO).build();
	}

	@GET
	@Path("/getAllQuestion")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getAllQuestion() {
		List<Question> list = qDAO.getAll();
		return Response.status(Status.OK).entity(list).build();
	}
	
	@POST
	@Path("/deleteQuestion")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response deleteQuestion(@RequestBody QuestionDTO questionDTO) {

		if (questionDTO.getId() == null) {
			return Response.ok(("Empty Question")).build();
		}
		

		mcqCDAO.deleteChild(questionDTO.getId());
		
		qDAO.delete(questionDTO.getId());
		return Response.status(Status.OK).entity(questionDTO).build();
	}
}