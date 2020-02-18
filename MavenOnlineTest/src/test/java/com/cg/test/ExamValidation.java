package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cg.dao.ExamDao;
import com.cg.dao.ExamDaoImpl;
import com.cg.exception.ExamException;
import com.cg.exception.UserException;

public class ExamValidation {
	@Test
	@DisplayName("Validation for wrong TestId")
	public void ExamValidation1() throws ExamException {
		ExamDao dao = new ExamDaoImpl();
		assertThrows(ExamException.class,()->dao.getTestId(8));
	}
	
	@Test
	@DisplayName("Validation for wrong UserId")
	public void ExamValidation22() throws UserException {
		ExamDao dao = new ExamDaoImpl();		
		assertThrows(UserException.class,()->dao.getUserId(2004));
	}
}
