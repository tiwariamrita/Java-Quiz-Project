package fr.epita.quiz.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MCQAnswer")

public class MCQanswer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="Exam_name")
	private Exam eName;
	
	@ManyToOne
	@JoinColumn(name="Student_name")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="MCQchoice")
	private MCQchoice choice;

	public MCQanswer() {
	
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Exam getExam() {
		return eName;
	}

	public void setExam(Exam exam) {
		this.eName = exam;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public MCQchoice getChoice() {
		return choice;
	}

	public void setChoice(MCQchoice choice) {
		this.choice = choice;
	}
}
