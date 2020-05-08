package fr.epita.quiz.exceptions;
import fr.epita.quiz.business.BusinessExceptions;

@SuppressWarnings("serial")
public class ExamBusinessException extends BusinessExceptions {
	
	public ExamBusinessException(String ext) {
		super(ext);
	}
}


