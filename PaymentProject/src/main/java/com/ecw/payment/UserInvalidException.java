package com.ecw.payment;

public class UserInvalidException extends Exception {
	
	UserInvalidException(String message){
		super(message);
	}
	
	private static final long serialVersionUID = 1L;
}
