package fr.epita.quiz.datamodel;

import javax.persistence.*;

@Entity
@Table(name = "QUESTIONS")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Qid;
	
	@Column(name="Question_title")
	private String Qtitle;
	
	
	public Question() {
	}

	public Long getId() {
		return Qid;
	}

	public void setId(Long qid) {
		this.Qid = qid;
	}

	public String getTitle() {
		return Qtitle;
	}

	public void setTitle(String title) {
		this.Qtitle = title;
	}

}
