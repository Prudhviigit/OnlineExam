package com.cg.exception;

public class UserException extends Exception {


	public UserException(String message) {
		super(message);
		System.err.println(message);

		}
	public UserException() {
		
	}

}
