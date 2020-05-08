package fr.epita.quizAPI.resources;

import fr.epita.quiz.datamodel.Exam;

public class ExamDTO {
	
	private Long id;
	private String title;
	
	public ExamDTO() {
		
	}

	public ExamDTO(Exam exam) {
		this.title = exam.geteName();
		this.id = exam.geteID();
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

}
