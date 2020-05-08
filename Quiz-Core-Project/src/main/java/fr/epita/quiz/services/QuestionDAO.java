package fr.epita.quiz.services;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import fr.epita.quiz.datamodel.Question;

public class QuestionDAO extends GenericDAO<Question, Long>{

	@Override
	public String getQuery() {
		return "from Question where title = :pTitle";
	}
	
	@Override
	public void setParameters(Map<String, Object> parameters, Question criteria) {
		parameters.put("pTitle", criteria.getTitle());
		
	}

	@Override
	public Class<Question> getEntityClass() {
		return Question.class;
	}

	public List<Question> getAll() {
		String newquery = "from Questions";
		Query searchQuery = em.createQuery(newquery);
		return searchQuery.getResultList();	
	}
}


