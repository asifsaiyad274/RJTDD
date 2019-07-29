package com.ecw.collections;

public class StackException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public StackException(String message) {
		super("Stack : "+message);
	}
}
