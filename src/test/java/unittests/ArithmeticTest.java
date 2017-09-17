package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.ReUsableFunctions;

public class ArithmeticTest {
	ReUsableFunctions at = new ReUsableFunctions();
	
	@Test
	public void testAddition(){
		double op = at.Addition(10, 20);
		assertEquals("Validation of Addition functionality", 30.0, op, 2);
	}
	
	@Test
	public void testSubtraction(){
		double op = at.Subtraction(10, 20);
		assertEquals("Validation of Subtraction functionality", -10.0, op, 2);
	}
	
	@Test
	public void testMultiplication(){
		double op = at.Multiplication(10, 20);
		assertEquals("Validation of multiplication functionality", 200.0, op, 2);
	}
	
	@Test
	public void testDivision(){
		double op = at.division(10, 20);
		assertEquals("Validation of division functionality", 0.5, op, 2);
	}
}
