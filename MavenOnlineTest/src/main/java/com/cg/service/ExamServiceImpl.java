package com.cg.service;

import java.util.List;

import com.cg.dao.ExamDaoImpl;
import com.cg.entity.Exam;
import com.cg.entity.ExamAssign;
import com.cg.entity.User;
import com.cg.exception.ExamException;
import com.cg.exception.TestIdException;
import com.cg.exception.UserException;
import com.cg.exception.UserIdException;

public class ExamServiceImpl implements ExamService {
	User user;
	Exam exam ;
	ExamDaoImpl dao = new ExamDaoImpl();
	
	/**
	 * @author : Prudhvi
	 * @Method : This method validates the testID and UserId. 
	 * @param  : testId and UserId parameters are passed for validation purpose.
	 * @return : It returns true if validations are successful.
	 */
	@Override
	public boolean addTest(int userId, int testId) throws ExamException, UserIdException, TestIdException, UserException {
	
		
		String str1 = String.valueOf(userId);
		String str2 = String.valueOf(testId);
		if(userId<0) {
			throw new UserIdException("User Id must be positive");
		}
		if(!str1.matches("[0-9]{4}")) {
			throw new UserIdException("User Id not matching requirement");
		}
		if(testId<0) {
			throw new TestIdException("Test Id must be positive");
		}
		
		if(!str2.matches("[0-9]{1}")) {
			throw new TestIdException("Test Id not matching requirement");
		}
		user = dao.getUserId(userId);
		exam = dao.getTestId(testId);
		ExamAssign ea = new ExamAssign(user, exam);
		ea.setStatus("active");
		dao.addExamToStudent(ea);
		return true;
	}
	public List<ExamAssign> getAssignment(String status) throws ExamException{
		List<ExamAssign> examassignlist =dao.getAssignment(status);
		if(examassignlist.isEmpty())
			throw new ExamException("No Results Found!.");
		return examassignlist;
	}
}
