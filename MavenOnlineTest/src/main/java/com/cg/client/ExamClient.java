package com.cg.client;

import com.cg.exception.ExamException;    
import com.cg.exception.TestIdException;
import com.cg.exception.UserIdException;  
import com.cg.exception.UserException;
import com.cg.service.ExamServiceImpl;

public class ExamClient {
	
	public static void main(String[] args) throws ExamException, UserIdException, TestIdException, UserException {
		ExamServiceImpl ser = new ExamServiceImpl();
	    ser.getAssignment("completed").forEach(System.out::println);
	  //THE ABOVE METHOD DISPLAYS TOTAL DETAILS WHO ARE IN COMPLETED STATE
	    
		System.out.println("------------------------------------------------------------------");
	    ser.getAssignment("active").forEach(System.out::println);
			
		} //THE ABOVE METHOD DISPLAYS TOTAL DETAILS WHO ARE IN ACTIVE STATE
}