package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cg.exception.TestIdException;
import com.cg.exception.UserIdException;
import com.cg.service.ExamService;
import com.cg.service.ExamServiceImpl;

public class ExamTest {
	@Test
	@DisplayName("Validation for wrong TestId")
	public void ExamTest1() throws TestIdException {
		ExamService ser = new ExamServiceImpl();
		assertThrows(TestIdException.class,()->ser.addTest(1006,60));
	}
	
	@Test
	@DisplayName("Validation for wrong UserId")
	public void ExamTest2() throws  UserIdException {
		ExamService ser = new ExamServiceImpl();
		assertThrows(UserIdException.class,()->ser.addTest(104,5));
	}
	
	@Test
	@DisplayName("Validation for negative TestId")
	public void ExamTest3() throws TestIdException, UserIdException{
		ExamService ser = new ExamServiceImpl();
		assertThrows(UserIdException.class,()->ser.addTest(-1001,7));
	}
	
	@Test
	@DisplayName("Validation for negative UserId")
	public void ExamTest4() throws TestIdException, UserIdException{
		ExamService ser = new ExamServiceImpl();
		assertThrows(TestIdException.class,()->ser.addTest(2001,-9));
	}
	
}
