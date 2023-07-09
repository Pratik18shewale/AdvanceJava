package com.app.exception_handler;

@SuppressWarnings("serial")
public class CustomException extends RuntimeException{
	
	public CustomException(String msg) {
		super(msg);
	}
}
