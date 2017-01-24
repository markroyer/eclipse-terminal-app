/**
 * 
 */
package edu.umaine.cs.eta;

import java.math.BigInteger;

/**
 * Fibonacci sequence calculator. This is really just a simple object to show
 * that the application is running properly.
 * 
 * @author Mark Royer
 *
 */
public class Fibonnacci {

	/**
	 * Calculate the first n Fibonacci numbers.
	 * 
	 * @param n
	 *            The number of Fibonacci numbers to calculate (n >= 0)
	 * @return
	 */
	public BigInteger[] calculate(int n) {
		BigInteger[] result = new BigInteger[n];
		if (n > 0)
			result[0] = BigInteger.valueOf(0);
		if (n > 1) {
			result[1] = BigInteger.valueOf(1);
			for (int i = 2; i < n; i++) {
				result[i] = result[i - 1].add(result[i - 2]);
			}
		}
		return result;
	}

}
