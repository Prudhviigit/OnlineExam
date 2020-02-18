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
	@Override
	public Exam getTestId(int testId) throws ExamException {
		if(!Repository.exammap.containsKey(testId)) 
			throw new ExamException("Invalid testId");
		return Repository.exammap.get(testId);
			
	}

	@Override
	public User getUserId(int userId) throws UserException {
		if(!Repository.usermap.containsKey(userId))
			throw new UserException("Invalid  UserId");
		return Repository.usermap.get(userId);
	}

	@Override
	public boolean addExamToStudent(ExamAssign eassign) throws ExamException {
		if(!Repository.examAssignMap.containsKey(eassign.getUser().getUserId()));
			Repository.examAssignMap.put(eassign.getUser().getUserId(), eassign);
		
		
		return true;
	}
	@Override
	public List<ExamAssign> viewAssignments() {
		List<ExamAssign> lst=Repository.examAssignMap.values().stream().collect(Collectors.toList());
		return lst;
		
	}
	ExamAssign ea = new ExamAssign();
	public List<ExamAssign> getAssignment(String status){
		
		List<ExamAssign> lst = Repository.examAssignMap.values().stream().filter(ea->ea.getStatus().equals(status)).collect(Collectors.toList());
		return lst;

	}
}
