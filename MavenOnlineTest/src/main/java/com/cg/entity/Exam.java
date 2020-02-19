package com.cg.entity;

public class Exam {
	private int testId;
	private String examname;
	private int minutes;
	public Exam(int testId, String examname,int minutes) {
		super();
		this.testId = testId;                         // Parameterized constructor
		this.examname = examname;
		this.minutes= minutes;
	}
	
	public Exam() {    // No Parameter Constructor
		super();
	}

	public int getExamId() {
		return testId;
	}
	public void setExamId(int examId) {
		this.testId = examId;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return testId+" "+examname+" "+minutes;
	}
}
