package com.af.primefactor

import spock.lang.Specification

/**
 * Based on https://www.programmingwithwolfgang.com/tdd-kata/ : Prime Factor Kata
 */
class PrimeFactorsSpec extends Specification {
	
	def 'Specification should return a list of factors for given number'(){
		given:
			def result;
		when:
			result = PrimeFactors.generate(number);
		then:
			expectedResult == result
		where:
			number		|		expectedResult
			100			|	[2,2,5,5]
		
	}
	
}
