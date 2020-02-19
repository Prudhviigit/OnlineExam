package com.cg.entity;

public class ExamAssign {
	private User user;
	private Exam exam;
	private int marks;
	private String status;
	public ExamAssign(User user, Exam exam, int marks, String status) {
		super();
		this.user = user;
		this.exam = exam;                                  // Parameterized constructor
		this.marks = marks;
		this.status = status;
	}
	public ExamAssign(User user, Exam exam) {
		super();
		this.user = user;
		this.exam = exam;
	}  
	public ExamAssign() {                                // No Parameter Constructor
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return user+" "+exam+" "+marks+" "+status;
	}
	
}
