package com.af.primefactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Based on https://www.programmingwithwolfgang.com/tdd-kata/ : Prime Factor Kata
 */
public class PrimeFactors {
	
	public static List<Integer> generate(final int number){
		
		final int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		List<Integer> factorsList = new ArrayList<>();
		
		int localNumber = number;
		int currentPrime = 0;
		for(int i=0; i<number; i++) {
			currentPrime = primeNumbers[i];
			while(true) {
				if(localNumber%currentPrime == 0) {
					factorsList.add(currentPrime);
					localNumber/=currentPrime;
					continue;
				}
				break;
			}
			
			if(localNumber == 1) {
				break;
			}
		}
		
		return factorsList;
	} 
}
