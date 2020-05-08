package fr.epita.quiz.datamodel;

import javax.persistence.*;

@Entity
@Table(name = "MCQCHOICES")
public class MCQchoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	
	@OneToOne
	@JoinColumn(name = "qid")
	private Question question;
	
	@Column(name = "Choices")
	private String choice;
	
	@Column(name = "Right_Answer")
	private Boolean answer;
	
	public MCQchoice() {	
	}
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public Long getCid() {
		return cid;
	}
	
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Boolean getAnswer() {
		return answer;
	}

	public void setAnswer(Boolean answer) {
		this.answer = answer;
	}

	public void setChoice(String choice2) {
		// TODO Auto-generated method stub
		
	}


	
	
}

