package fr.epita.quiz.tests;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.datamodel.Exam;
import fr.epita.quiz.services.ExamDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationcontext.xml")
public class TestExamDAO {
	
	@Inject
	ExamDAO eDAO;
	
	@Test
	public void test() {
		//examDAO.getAll();
		
		Exam exam = new Exam();
		exam.seteName("Java Exam");
		List<Exam> list = eDAO.search(exam);
		System.out.println(list);
	}
}
