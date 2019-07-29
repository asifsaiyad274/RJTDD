package com.ecw.collections;

public class Stack {
	
	private Object[] stack = new Object[10];
	private int currentIndex = 0;
	
	public void push(Object value) throws StackException {
		stack[currentIndex++]=value;
	}
	
	public Object pop() throws StackException {
		if(currentIndex <= 0) {
			throw new StackException("is empty !");
		}
		
		return stack[--currentIndex];
	}
}
