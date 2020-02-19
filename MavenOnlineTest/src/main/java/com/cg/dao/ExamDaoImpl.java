package com.cg.dao;

import java.util.List;
import java.util.stream.Collectors;

import com.cg.entity.Exam;
import com.cg.entity.ExamAssign;
import com.cg.entity.User;
import com.cg.exception.ExamException;
import com.cg.exception.UserException;
import com.cg.repository.Repository;
public class ExamDaoImpl implements ExamDao{

	public ExamDaoImpl() {
		
	}
	
	/**
	 * @author : Prudhvi
	 * @Method : This method validates the testID by getting the testId from Map
	 * @param  : testId parameter is passed for validation purpose
	 * @return : It returns the map of testId 
	 */
	@Override
	public Exam getTestId(int testId) throws ExamException { 
		if(!Repository.exammap.containsKey(testId))                 //DEFINING  getTestId FUNCTION 
			throw new ExamException("Invalid testId");
		return Repository.exammap.get(testId);
			
	}
	
	/**
	 * @author : Prudhvi
	 * @Method : This method validates the UserID by getting the UserId from Map
	 * @param  : UserId parameter is passed for validation purpose
	 * @return : It returns the map of UserId 
	 */

	@Override
	public User getUserId(int userId) throws UserException {
		if(!Repository.usermap.containsKey(userId))
			throw new UserException("Invalid  UserId");              //DEFINING  getUserId FUNCTION 
		return Repository.usermap.get(userId);
	}

	@Override
	public boolean addExamToStudent(ExamAssign eassign) throws ExamException {
		if(!Repository.examAssignMap.containsKey(eassign.getUser().getUserId()));    //DEFINING addExamToStudent FUNCTION
			Repository.examAssignMap.put(eassign.getUser().getUserId(), eassign);
		
		
		return true;
	}
	@Override
	public List<ExamAssign> viewAssignments() {
		List<ExamAssign> lst=Repository.examAssignMap.values().stream().collect(Collectors.toList()); 
		return lst;
		
	}
	ExamAssign examassign = new ExamAssign();
	public List<ExamAssign> getAssignment(String status){
		
		List<ExamAssign> lst = Repository.examAssignMap.values().stream().filter(examassign->examassign.getStatus().equals(status)).collect(Collectors.toList());
		return lst;

	}
}
