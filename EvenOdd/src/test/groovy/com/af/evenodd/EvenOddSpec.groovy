package com.af.evenodd

import spock.lang.Specification

/**
 * Based on https://www.programmingwithwolfgang.com/tdd-kata/ : Even or Odd
 *
 */
class EvenOddSpec extends Specification {
	
	def 'Specification should return even or odd for sum of numbers'(){
		given:
			def result;
		when:
			result = EvenOdd.isSumEvenOrOdd(numericArray);
		then:
			expectedResult == result
		where:
			numericArray 			|	expectedResult
			returnArray()			|	null
			returnArray(0)			|	"even"
			returnArray(1,2)		|	"odd"
			returnArray(2,5,34,6)	|	"odd"
			returnArray(0,-1,-5)	|	"even"
	}
	
	private def returnArray(int... array) {
		return array;		
	}
	
}
