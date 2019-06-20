package com.atmecs.calc;
/**
 * Date- 20/06/2019
 * The Addition class performs the addition operation on integers and 
 * return their sum.
 * @author Sachin.Singh
 * @version 1.0
 */

public class Addition {
	/**
	 * This method performs addition of integers of 'n' numbers and takes 
	 * varargs parameter of integer type.
	 * @param  num is a varargs parameter
	 * @return result of addition
	 *
	 */
	
	public int additionOfNumbers(int... num) {
		int res=0;
		for(int num1 : num) {
			res =res+num1;
		}
		return res;
	}

}
