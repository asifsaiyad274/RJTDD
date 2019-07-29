package com.ecw.collections

import spock.lang.Ignore
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class StackShould extends Specification {
	@Shared stack = new Stack();

	@Ignore
	@Unroll
	def 'Push value in stack'(){
		given: 'value to be pushed in an stack'
				
		expect: 'value pushed'
			stack.push(value);
		where:
			value	|	_
			"first"	|	_
			"second"|	_
	}
	
	@Ignore
	@Unroll
	def 'Pop value from stack'(){
		given: 'stack with last pushed value'
			def poppedValue;
		when: 'value popped'
			poppedValue = stack.pop();
		then:
			expectedValue == poppedValue;	
		where:
			expectedValue	|	_
			"second"		|	_ 
			"first"			|	_
			
	}
	
	@Unroll
	def 'Throw exception while popping an empty stack'(){
		when: 'value popped'
			stack.pop();
		then:
			thrown(Exception)
	}
	
	@Unroll
	def 'Pop the last pushed value first from stack'(){
		given: 'stack with last pushed value'
			stack.push("A");
			stack.push("B");
			stack.push("C");
		expect: 		
			stack.pop() == "C";
			stack.pop() == "B";
			stack.pop() == "A";
	}	
}
