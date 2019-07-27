package stringkata;

import org.spockframework.compiler.model.SetupBlock

import spock.lang.Specification

class StringKataSpec extends Specification {
	
		def setupSpec() {
			print('setupSpec called !');
		}
	
		def setup() {
			print('setup called !');
		}
		
		def 'Simple String calculator'(){
			given:
			def stringKata = new StringKata();
			def result
			
			when:
			result = stringKata.calculateSum("")
			
			then:
			result == 0
		}
		
		def cleanup() {
			print('cleanup called !');
		}
		
		def cleanupSpec() {
			print('cleanupSpec called !');
		}
}
