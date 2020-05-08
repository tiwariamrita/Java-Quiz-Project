package fr.epita.quiz.services;

import java.util.Map;

import fr.epita.quiz.datamodel.MCQanswer;

public class MCQAnswerDAO extends GenericDAO<MCQanswer, Long>{

	@Override
	public String getQuery() {
		return "from MCQanswer where id = :pid";
	}
	
	@Override
	public void setParameters(Map<String, Object> parameters, MCQanswer criteria) {
		parameters.put("pid", criteria.getId());
		
	}

	@Override
	public Class<MCQanswer> getEntityClass() {
		return MCQanswer.class;
	}
	
}