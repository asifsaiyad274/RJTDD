package com.af.evenodd;

import java.util.stream.IntStream;

/**
 * Based on https://www.programmingwithwolfgang.com/tdd-kata/ : Even or Odd
 *
 */
public class EvenOdd {
	public static String isSumEvenOrOdd(int[] numericArray){
		if(numericArray == null || numericArray.length == 0) {
			return null;
		}
		if(IntStream.of(numericArray).sum()/2 == 0) {
			return "even";
		}
		return "odd";
	}
}
