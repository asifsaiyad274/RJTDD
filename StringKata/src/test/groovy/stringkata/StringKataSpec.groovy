package stringkata;

import spock.lang.Specification

class StringKataSpec extends Specification {
		def 'this is expect clause'(){
			expect:
			Math.max(1, 2) == 2
		}
}
