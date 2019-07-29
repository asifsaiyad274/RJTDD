package com.ecw.utilities

import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralsConverterShould extends Specification {

		@Unroll
		def 'Return I if number is 1'(){
			given:
				def romanNumeralsConverter = new RomanNumeralsConverter();
				def romanNumeral;
			when:
				romanNumeral = romanNumeralsConverter.convert(englishNumeral);
			then:
				expectedResult == romanNumeral
			where:
			englishNumeral		|		expectedResult
			1					|		"I"
			5					|		"V"
			10					|		"X"
			50					|		"L"
			100					|		"C"
			500					|		"D"
			1000				|		"M"
			2					|		"II"
			3					|		"III"
			4					|		"IV"
			6					|		"VI"	
			7					|		"VII"
			8					|		"VIII"
			9					|		"IX"
			10					|		"X"
			11					|		"XI"
			12					|		"XII"
			13					|		"XIII"
			14					|		"XIV"
			15					|		"XV"
			16					|		"XVI"
			17					|		"XVII"
			18					|		"XVIII"
			19					|		"XIX"
			20					|		"XX"
			24					|		"XXIV"
			37					|		"XXXVII"
			43					|		"XLIII"
			44					|		"XLIV"
			46					|		"XLVI"
			49					|		"XLIX"
			50					|		"L"
			54					|		"LIV"
			59					|		"LIX"
			68					|		"LXVIII"
//			93					|		"XCIII"
			102					|		"CII"
			
//			2499				|		"MMCDXCIX"
		}
	
}
