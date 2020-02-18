package com.cg.exception;

public class TestIdException extends Exception{

	public TestIdException(){
		
	}
	public TestIdException(String message){
		System.err.println(message);
	}
}
