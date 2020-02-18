package com.cg.service;

import java.util.List;

import com.cg.entity.ExamAssign;
import com.cg.exception.ExamException;
import com.cg.exception.TestIdException;
import com.cg.exception.UserException;
import com.cg.exception.UserIdException;

public interface ExamService {


	boolean addTest(int userId, int testId) throws ExamException, UserIdException, TestIdException, UserException;
	public List<ExamAssign> getAssignment(String status) throws ExamException;

	}
