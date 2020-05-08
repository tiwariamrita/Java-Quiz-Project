package fr.epita.quiz.business;

@SuppressWarnings("serial")
public class BusinessExceptions extends Exception {
	
	public BusinessExceptions(String ext) {
		System.out.println(ext);
	}
}
