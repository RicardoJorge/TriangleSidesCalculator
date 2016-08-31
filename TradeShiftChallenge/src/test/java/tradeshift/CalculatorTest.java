package test.java.tradeshift;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.tradeshift.Calculator;
import main.java.tradeshift.TriangleType;



public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void before(){
		calculator = new Calculator();
	}

	@Test
	public void isTriangleEquilateral() {
		
		assertEquals(calculator.GetTriangleType(12, 12, 12), TriangleType.EQUILATERAL);
		
	}
	
	@Test
	public void isTriangleIsosceles() {
		
		assertEquals(calculator.GetTriangleType(12, 3, 12), TriangleType.ISOSCELES);
	
	}
	
	@Test
	public void isTriangleScalene() {
				
		assertEquals(calculator.GetTriangleType(12, 3, 32), TriangleType.SCALENE);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void calculatorRequiresPositiveValuesForTriangleSides(){
		
		calculator.GetTriangleType(-1, -1, -1);
	}
	
}
