package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator c = new Calculator();
	
	@Test
	void additionTest() {
		assertEquals(10, c.addition(5, 5));
	}
	
}
