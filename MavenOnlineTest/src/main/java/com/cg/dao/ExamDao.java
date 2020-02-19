package com.cg.dao;

import java.util.List;

import com.cg.entity.Exam;
import com.cg.entity.ExamAssign;
import com.cg.entity.User;
import com.cg.exception.ExamException;
import com.cg.exception.UserException;

public interface ExamDao {
	public Exam getTestId(int testId) throws ExamException;
	public User getUserId(int userId) throws UserException;
	public boolean addExamToStudent(ExamAssign eassign) throws ExamException;   //DECLARING REQUIRED FUNCTIONS
	public List<ExamAssign> viewAssignments();
	public List<ExamAssign> getAssignment(String status);
}