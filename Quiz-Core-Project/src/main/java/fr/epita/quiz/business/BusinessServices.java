package fr.epita.quiz.business;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import fr.epita.quiz.services.*;
import fr.epita.quiz.datamodel.*;

public class BusinessServices {
	
	@Inject
	StudentDAO sDAO;
	
	@Inject
	ExamDAO eDAO;
	
	@Inject
	QuestionDAO qDAO;
	
	@Inject
	MCQChoiceDAO mcqCDAO;
	
	@Inject
	MCQAnswerDAO mcqADAO;
	
	@Inject
	AnswerDAO aDAO;
	
	
	@Transactional(value = TxType.REQUIRED)
	public void answerQuestion(Student user, Question question, Answer answer, Exam exam) throws BusinessExceptions {
		
		
		if (user == null || question == null || answer == null || exam == null) {
			throw new NullPointerException();
		}
		
		if (qDAO.getById(question.getId()) == null) {
			throw new BusinessExceptions("Error: Question does not exist");
		}
		
		if (sDAO.getById(user.getsID()) == null) {
			throw new BusinessExceptions("Error: User does not exist");
		}
		
		if (eDAO.getById(exam.geteID()) == null) {
			throw new BusinessExceptions("Error: Exam does not exist");
		}
		
		answer.setStudent(user);
		answer.setQuestion(question);
		answer.setExam(exam);
		
		aDAO.create(answer);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void answerToMCQ(Student user, MCQchoice choice, Exam exam, MCQanswer mcqAnswer) throws BusinessExceptions {
		
		if (user == null || choice == null || exam == null || mcqAnswer == null) {
			throw new NullPointerException();
		}
		
		if (sDAO.getById(user.getsID()) == null) {
			throw new BusinessExceptions("Error: User does not exist");
		}
		
		if (mcqCDAO.getById(choice.getCid()) != null) {
			throw new BusinessExceptions("Error: Choice already exist");
		}
		
		if (eDAO.getById(exam.geteID()) == null) {
			throw new BusinessExceptions("Error: Exam does not exist");
		}
		
		
		mcqAnswer.setExam(exam);
		mcqAnswer.setStudent(user);
		mcqAnswer.setChoice(choice);
		
		mcqADAO.create(mcqAnswer);
		
	}
}

