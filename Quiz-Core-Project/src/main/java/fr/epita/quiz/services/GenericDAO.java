package fr.epita.quiz.services;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDAO<T,I> {
	@PersistenceContext
	protected EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void create(T entity) {
		em.persist(entity);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void delete(Long long1) {
		em.refresh(long1);
		em.remove(long1);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void update(T exam) {
		em.merge(exam);
	}
	
	public abstract String getQuery() ;
	public abstract void setParameters(Map<String,Object> parameters, T criteria);
	
	
	@SuppressWarnings("unchecked")
	public List<T> search(T criteria){
		Query searchQuery = em.createQuery(getQuery());
		Map<String, Object> parameters = new LinkedHashMap<String, Object>();		
		setParameters(parameters,criteria);
		for (Map.Entry<String,Object> entry : parameters.entrySet() ) {
			searchQuery.setParameter(entry.getKey(), entry.getValue());
		}		
		return searchQuery.getResultList();		
	}
	
	public T getById(I long1) {
		return em.find(getEntityClass(), long1);
	}
	
	public abstract Class<T> getEntityClass();
	
	
}
