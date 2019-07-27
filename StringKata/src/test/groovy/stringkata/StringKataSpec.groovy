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
}
