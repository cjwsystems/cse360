
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
	private String str = "0 ";
	

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
		str += "+ " + value + " ";
	}
	
	/**
	 * Subtract
	 * @param value is input number to be subtracted from total
	 */
	public void subtract (int value) {
		total -=value;
		str += "- " + value + " ";
	}
	
	/**
	 * Multiply
	 * @param value is input number to be multiplied by total
	 */
	public void multiply (int value) {
		total *= value;
		str += "* " + value + " ";
	}
	
	/**
	 * Divide
	 * @param value is input number to be divided
	 */
	public void divide (int value) {
		if (value != 0)
			total = total / value;
		else
			System.out.println("Divie by zero error");
		str += "/ " + value + " ";
	}
	
	/**
	 * getHistory
	 * @return returns history as string
	 */
	public String getHistory () {
		return str;
	}
}