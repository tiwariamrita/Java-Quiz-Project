package fr.epita.quiz.services;

import java.util.Map;

import javax.persistence.Query;

import fr.epita.quiz.datamodel.Exam;

public class ExamDAO extends GenericDAO<Exam, Long>{

	@Override
	public String getQuery() {
		return "from Exam where name = :eName";
	}
	
	@Override
	public void setParameters(Map<String, Object> parameters, Exam criteria) {
		parameters.put("eName", criteria.geteName());
		
	}

	@Override
	public Class<Exam> getEntityClass() {
		return Exam.class;
	}


	public Object getAll() {
		// TODO Auto-generated method stub
		String newquery = "from Exam";
		Query searchQuery = em.createQuery(newquery);
		return searchQuery.getResultList();	
	}

}
