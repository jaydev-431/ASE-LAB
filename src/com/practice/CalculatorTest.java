package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator c = new Calculator();
	
	@Test
	void additionTest() {
		assertEquals(12, c.addition(6, 6));
	}
	
}
