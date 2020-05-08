package fr.epita.quizAPI.resources;

import fr.epita.quiz.datamodel.Exam;
import fr.epita.quiz.datamodel.Question;

public class QuestionDTO {
		
		private Long id;
		private String title;

		public QuestionDTO() {
		}
		
		public QuestionDTO(Question question) {
			this.id = question.getId();
			this.title = question.getTitle();
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
