package fizzBuzzTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import fizzBuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void multiplesOfThreeButNotFiveAreFizz() {
	    for (int i = 1; i <= 100; i++) {
	        if ((i % 3 == 0) && !(i % 5 == 0)) {
	            assertEquals("Fizz", FizzBuzz.FizzBuzz(i));
	        }
	    }
	}
	 
	@Test
	public void multiplesOfFiveButNotThreeAreBuzz() {
	    for (int i = 1; i <= 100; i++) {
	        if (!(i % 3 == 0) && (i % 5 == 0)) {
	            assertEquals("Buzz", FizzBuzz.FizzBuzz(i));
	        }
	    }
	}
	
	@Test
	public void multiplesOfThreeAndFiveAreFizzBuzz() {
	    for (int i = 1; i <= 100; i++) {
	        if ((i % 3 == 0) && (i % 5 == 0)) {
	            assertEquals("FizzBuzz", FizzBuzz.FizzBuzz(i));
	        }
	    }
	}
	
	@Test
	public void othersNumberPrintNumber() {
		for (int i = 1; i <= 100; i++) {
			if (!(i % 3 == 0) && !(i % 5 == 0)) {
				assertEquals(String.valueOf(i), FizzBuzz.FizzBuzz(i));
			}
		}
	}
}
