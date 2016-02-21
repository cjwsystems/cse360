
package cse360assign3;
/**
 * Calculator Class for basic arithmetic
 * @author Chris Ward
 * @version Feb 21,206
 * 
 */

public class Calculator {
	/**
	 * str contains history of all actions
	 */
	private int total;
	private String str = "";
	

	/**
	 * @param Calculator() default constructor. 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * @return getTotal returns correct value of total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add
	 * @param value is input number to be added to total
	 */
	public void add (int value) {
		total += value;
		str += "+";
	}
	
	/**
	 * Subtract
	 * @param value is input number to be subtracted from total
	 */
	public void subtract (int value) {
		total -=value;
		str += "-";
	}
	
	/**
	 * Multiply
	 * @param value is input number to be multiplied by total
	 */
	public void multiply (int value) {
		total *= value;
		str += "*";
	}
	
	/**
	 * Divide
	 * @param value is input number to be divided
	 */
	public void divide (int value) {
		if (value != 0)
			total /= value;
		else
			System.out.println("Divie by zero error");
		str += "/";
	}
	
	/**
	 * getHistory
	 * @return returns history as string
	 */
	public String getHistory () {
		return str;
	}
}