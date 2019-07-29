package com.ecw.utilities;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {
	
	static Map<Integer, String> englishToRomanNumeralMap = new HashMap<>(); 
	
	static {
		englishToRomanNumeralMap.put(1, "I");
		englishToRomanNumeralMap.put(2, "II");
		englishToRomanNumeralMap.put(3, "III");
		englishToRomanNumeralMap.put(4, "IV");
		englishToRomanNumeralMap.put(5, "V");
		englishToRomanNumeralMap.put(9, "IX");
		englishToRomanNumeralMap.put(10, "X");
		englishToRomanNumeralMap.put(50, "L");
		englishToRomanNumeralMap.put(100, "C");
		englishToRomanNumeralMap.put(500, "D");
		englishToRomanNumeralMap.put(1000, "M");
	}
	
	public static String convert(int englishNumeral) {
		StringBuilder romanString = new StringBuilder();
		
		englishNumeral = appendRomanNumeral(englishNumeral, 1000, 5000, romanString);
		englishNumeral = appendRomanNumeral(englishNumeral, 500, 1000, romanString);
		englishNumeral = appendRomanNumeral(englishNumeral, 100, 500, romanString);
		englishNumeral = appendRomanNumeral(englishNumeral, 50, 100, romanString);
		englishNumeral = appendRomanNumeral(englishNumeral, 10, 50, romanString);
		englishNumeral = appendRomanNumeral(englishNumeral, 5, 10, romanString);
		
		if(englishNumeral!=0)
			romanString.append(englishToRomanNumeralMap.get(englishNumeral));
		
		if(romanString.length()>1) {
			return romanString.toString();
		}
		return englishToRomanNumeralMap.get(englishNumeral);
	}
	
	private static int appendRomanNumeral(int englishNumeral, int minValue, int maxValue, StringBuilder romanString ) {
		while(true) {
			
			if(englishNumeral == 0) {
				break;
			}
			if(englishNumeral == 9) {
		    	romanString.append(englishToRomanNumeralMap.get(9));
		    	englishNumeral-=9;
		    	break;
		    }
			else if(englishNumeral < maxValue 
						&& englishNumeral>minValue) {
				
				if(englishNumeral > minValue*4) {
					romanString.append(englishToRomanNumeralMap.get(minValue))
							   .append(englishToRomanNumeralMap.get(maxValue));
					
					englishNumeral-=(minValue*4);
					break;
				}else {
					romanString.append(englishToRomanNumeralMap.get(minValue));
				}
				
			}else {
				break;
			}
			englishNumeral-=minValue;
		}
		return englishNumeral;
	}
}
