package com.cg.exception;

public class UserIdException extends Exception{

	public UserIdException() {
		super();		
	}

	public UserIdException(String message) {
		super(message);
		System.err.println(message);	
	}
}
