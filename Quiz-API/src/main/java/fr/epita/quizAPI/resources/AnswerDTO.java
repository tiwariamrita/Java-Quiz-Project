package fr.epita.quizAPI.resources;
import fr.epita.quiz.datamodel.Answer;

public class AnswerDTO {
	
public String content;
	
	public AnswerDTO() {
		
	}

	public AnswerDTO(Answer entity) {
		this.content = entity.getAnswer();
	}
	
	public String getContent() {
		return content;
	}

}
