package com.demo;

import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {
	
	public void testProcessNumber() {
		FizzBuzz fb = new FizzBuzz();

		assertEquals("1", fb.processNumber(1));
		assertEquals("2", fb.processNumber(2));
		assertEquals("Fizz", fb.processNumber(3));
		assertEquals("Fizz", fb.processNumber(6));
		assertEquals("Buzz", fb.processNumber(5));
		assertEquals("Buzz", fb.processNumber(10));
		assertEquals("FizzBuzz", fb.processNumber(15));
		assertEquals("FizzBuzz", fb.processNumber(30));
	}

	public void testProcessNumbers() {
		FizzBuzz fb = new FizzBuzz();
		
		assertEquals("1", fb.processNumbers(new int[] {1}));
		assertEquals("1, 2", fb.processNumbers(new int[] {1, 2}));
		assertEquals("1, 2, Fizz, Buzz, Fizz, Buzz, FizzBuzz, FizzBuzz", fb.processNumbers(new int[] {1, 2, 3, 5, 6, 10, 15, 30}));
	}
}
