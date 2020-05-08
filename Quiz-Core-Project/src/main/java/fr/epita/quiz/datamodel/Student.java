package fr.epita.quiz.datamodel;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sID;
	
	@Column(name = "Student_name")
	private String Sname;
	
	@Column(name="Student_email")
	private String Semail;

	public Long getsID() {
		return sID;
	}

	public void setsID(Long sID) {
		this.sID = sID;
	}

	public String getsName() {
		return Sname;
	}

	public void setsName(String sName) {
		this.Sname = sName;
	}
	
	public String getEmail() {
		return Semail;
	}
	
	public void setEmail(String email) {
		this.Semail = email;
	}
	
	

}
