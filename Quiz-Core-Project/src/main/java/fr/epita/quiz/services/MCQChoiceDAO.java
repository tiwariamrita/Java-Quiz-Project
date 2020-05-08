package fr.epita.quiz.services;

import java.util.Map;

import javax.persistence.Query;

import fr.epita.quiz.datamodel.MCQchoice;

public class MCQChoiceDAO extends GenericDAO<MCQchoice, Long>{

	@Override
	public String getQuery() {
		return "from MCQchoice where id = :pid";
	}
	
	@Override
	public void setParameters(Map<String, Object> parameters, MCQchoice criteria) {
		parameters.put("pid", criteria.getCid());
		
	}

	@Override
	public Class<MCQchoice> getEntityClass() {
		return MCQchoice.class;
	}

	public void deleteChild(Long id) {
		String newquery = "delete from MCQchoice where question = " +id;
		Query deleteQuery = em.createQuery(newquery);
		deleteQuery.executeUpdate();	
		
	}
	
}