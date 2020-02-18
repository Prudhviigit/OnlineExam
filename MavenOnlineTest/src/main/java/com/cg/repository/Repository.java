package com.cg.repository;

import java.util.HashMap;
import java.util.Map;

import com.cg.entity.Exam;
import com.cg.entity.ExamAssign;
import com.cg.entity.User;

public class Repository {
	public static Map<Integer, Exam> exammap = new HashMap<>();              //CREATING A STATIC MAP FOR EXAM 
	public static Map<Integer, User> usermap = new HashMap<>();              //CREATING A STATIC MAP FOR USER
	public static Map<Integer, ExamAssign> examAssignMap = new HashMap<>();  //CREATING A STATIC MAP FOR ASSIGNING AN EXAM TO A USER 
	static {
		
		Exam e1=new Exam(1, "Java",120);
		Exam e2=new Exam(2, "C++",120);                          //CREATING INSTANCE
		Exam e3=new Exam(3, "DataStructures",120);

		exammap.put(1, e1);
		exammap.put(2, e2);              //ENTERING THE DETAILS INTO MAP
		exammap.put(3, e3);


		User u1=new User(1001,"Hari", "H@123");
		User u2= new User(1002,"Ram", "R@123");                  //CREATING INSTANCE
		User u3= new User(1003,"Shiv", "S@123");

		usermap.put(1001, u1);
		usermap.put(1002,u2);            //ENTERING THE DETAILS INTO MAP
		usermap.put(1003,u3);

		
		ExamAssign a1=new ExamAssign(u1,e1,50,"completed"); 
		ExamAssign a2=new ExamAssign(u2,e2,40,"completed");      //CREATING INSTANCE
		ExamAssign a3=new ExamAssign(u3,e3,0,"active");

		examAssignMap.put(1001,a1);
		examAssignMap.put(1002,a2);      //ENTERING THE DETAILS INTO MAP
		examAssignMap.put(1003,a3);


	}
}