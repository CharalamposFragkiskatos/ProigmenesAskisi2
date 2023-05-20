package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class MyClassTest {

	 @Test
	void testPositive() {
		 MyClass tester = new MyClass();
		 assertEquals("POSITIVE", tester.biggerThanZero(10, 5), "10 - 5 is positive");
		 }
	 @Test
	void testNegative() {
		 MyClass tester = new MyClass();
		 assertEquals("NEGATIVE", tester.biggerThanZero(10, 25), "10 - 25 is negative");
		 }
	 @Test
	void testZero() {
		 MyClass tester = new MyClass();
		 assertEquals("ZERO", tester.biggerThanZero(25, 25), "25 - 25 is zero");
		 }
	}

