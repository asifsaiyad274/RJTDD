package stringkata;

import org.spockframework.compiler.model.SetupBlock

import spock.lang.Specification

class StringKataSpec extends Specification {
	
		def 'Simple String calculator'(){
			given:
				def stringKata = new StringKata();
				def result
			
			when:
				result = stringKata.calculateSum(numericString)
			
			then:
				expectedResult == result
			
			where:
				numericString		|	expectedResult
				null				|	0
				""					|	0
				"1"					|	1		
				"1,2"				|	3
				"1,3,5"				| 	9 
				"1\n3,5\n6"			| 	15
				"1\n3,5\n6//;\n1;2"	|	18
		}
		
		def 'Simple String calculator : Negative Test Cases'(){
			given:
				def stringKata = new StringKata();
				def error
			
			when:
				result = stringKata.calculateSum(numericString)
			
			then:
				error = thrown(expectedException)
				error.message == expectedMessage
			where:
				numericString		|		expectedException		|		expectedMessage
				"1\n3,-5\n6"		|	NegativeNotAllowedExpection	|	"Negatives not allowed : -5"
				"1\n-3,-5\n6"		|	NegativeNotAllowedExpection	|	"Negatives not allowed : -3 -5"
				"1\n-3,-5\n-6"		|	NegativeNotAllowedExpection	|	"Negatives not allowed : -3 -5 -6"
		}
		
}
