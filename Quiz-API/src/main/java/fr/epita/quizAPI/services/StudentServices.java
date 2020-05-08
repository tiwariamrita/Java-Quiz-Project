package fr.epita.quizAPI.services;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.RequestBody;

import fr.epita.quiz.datamodel.*;
import fr.epita.quiz.services.StudentDAO;
import fr.epita.quizAPI.resources.*;


@Path("/user")
public class StudentServices {
	
	@Inject
	StudentDAO sDAO;
	
	@POST
	@Path("/createUser")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response create(@RequestBody StudentDTO user) {
		
		
		Student student = new Student();
		student.setEmail(user.getEmail());
		student.setsName(user.getName());
		
		if (sDAO.getById(user.getsID()) == null) {
				sDAO.create(student);
				return Response.status(Status.OK).entity(user).build();
	
		}
		return null;
	}
	
	@POST
	@Path("/authenticateUser")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response authenticate(@RequestBody StudentDTO user) {
		if (user.getEmail() == null || user.getName() == null) {
			return Response.ok(("Fields cannot be empty")).build();
		}
		
		Student student = sDAO.getById(user.getsID());
		if (student != null) {
			if(student.getsName().equalsIgnoreCase(user.getName()) && student.getEmail().equalsIgnoreCase(user.getEmail())) {
				return Response.status(Status.OK).entity(user).build();
			}else {
				return Response.ok(("User not registered!!!")).build();
			}
		} else {
			return Response.ok(("User not registered!!!.")).build();
		}
	}
}
