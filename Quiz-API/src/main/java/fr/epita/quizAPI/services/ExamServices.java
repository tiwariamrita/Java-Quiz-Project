package fr.epita.quizAPI.services;

import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.RequestBody;

import fr.epita.quiz.services.*;
import fr.epita.quizAPI.resources.ExamDTO;
import fr.epita.quiz.business.*;
import fr.epita.quiz.datamodel.*;


@Path("/exam")
public class ExamServices {
	
	@Inject
	BusinessServices businessservice;
	
	@Inject
	AnswerDAO aDAO;
	
	@Inject
	ExamDAO eDAO;
	
	@Inject
	QuestionDAO qDAO;
	
	@GET
	@Path("/answer")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response answer() {
		
		Answer answer = new Answer();
		answer.setId(1l);
		
        Response response = Response.status(Status.OK).entity(answer).build();
        return response;
	}
	
	@POST
	@Path("/answer")
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response questionToAnswer(@RequestBody Answer answer) {
		try {
			return Response.created(new URI("/rest/exam/answer/" + answer.getId())).status(Status.OK).build();
		} catch (URISyntaxException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return Response.serverError().build();
	}
	
	@GET
	@Path("/answer/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getAnswer(@PathParam("id") Long answerId) {
		Answer answer = aDAO.getById(answerId);
		Response response = Response.ok(answer).build();
		return response;
	}
	
	@POST
	@Path("/createExam")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response createExam(@RequestBody ExamDTO examDTO) {
		
		
		Exam exam = new Exam();
		exam.seteName(examDTO.getTitle());
		
		eDAO.create(exam);
		
		examDTO.setId(exam.geteID());
		Response response = Response.ok(examDTO).build();
		return response;
	}
	
	@GET
	@Path("/getAllExam")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getAnswer() {
		Response response = Response.ok(eDAO.getAll()).build();
		return response;
	}
	
	@POST
	@Path("/deleteExam")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response deleteExam(@RequestBody ExamDTO examDTO) {
		eDAO.delete(examDTO.getId());	
		Response response = Response.ok(examDTO).build();
		return response;
	}
	
	@POST
	@Path("/updateExam")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response updateExam(@RequestBody ExamDTO examDTO) {

		Exam exam = new Exam();
		exam.seteID(examDTO.getId());
		exam.seteName(examDTO.getTitle());
		
		eDAO.update(exam);
		
		Response response = Response.ok(examDTO).build();
		return response;
	}

}
