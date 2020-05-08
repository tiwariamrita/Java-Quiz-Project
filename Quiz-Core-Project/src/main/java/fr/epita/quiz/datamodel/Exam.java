package fr.epita.quiz.datamodel;

import javax.persistence.*;

@Entity
@Table(name = "Exam")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eID;
	
	@Column(name = "Exam_name")
	private String eName;
	
	public Exam() {
		
	}
	
	public Long geteID() {
		return eID;
	}

	public void seteID(Long eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}


	
}
