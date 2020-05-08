package fr.epita.quiz.services;

import java.util.Map;

import fr.epita.quiz.datamodel.Student;

public class StudentDAO extends GenericDAO<Student, Long> {

	@Override
	public String getQuery() {
		return "from User where username = :pName" ;
	}

	@Override
	public void setParameters(Map<String, Object> parameters, Student criteria) {
		parameters.put("pName", criteria.getsName());
		
	}

	@Override
	public Class<Student> getEntityClass() {
		return Student.class;
	}

}

