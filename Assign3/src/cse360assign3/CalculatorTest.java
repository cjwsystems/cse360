package cse360assign3;
/**
 * Calculator JUnit Test Class 
 * @author Chris Ward
 * @version Feb 21,206
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		int num = calc.getTotal();
		assertEquals(0,num);
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(3);
		int num = calc.getTotal();
		assertEquals(3,num);
	}
	
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(3);
		int num = calc.getTotal();
		assertEquals(-3,num);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.multiply(3);
		int num = calc.getTotal();
		assertEquals(0,num);
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.divide(3);
		int num = calc.getTotal();
		assertEquals(0,num);
	}

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(0);
		calc.subtract(0);
		calc.multiply(0);
		calc.divide(1);
		assertEquals("0 + 0 - 0 * 0 / 1 ",calc.getHistory());
	}

}
