package com.cg.exception;

public class ExamException extends Exception{

	public ExamException(String message) {
		super(message);
		System.err.println(message);

		}
	public ExamException() {

	}

}
