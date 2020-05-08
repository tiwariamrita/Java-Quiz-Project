package fr.epita.quizAPI.resources;

import fr.epita.quiz.datamodel.Student;

public class StudentDTO {
		
		private long sID;
		private String name;
		private String email;

		public StudentDTO() {
		
		}
		
		public StudentDTO(Student student) {
			this.name = student.getsName();
			this.email = student.getEmail();
			this.sID = student.getsID();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getsID() {
			return sID;
		}

		public void setsID(long sID) {
			this.sID = sID;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


}
