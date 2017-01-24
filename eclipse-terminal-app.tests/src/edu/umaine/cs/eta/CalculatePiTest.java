package edu.umaine.cs.eta;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

/**
 * A few tests for the Fibonacci calculator.
 * 
 * @author Mark Royer
 *
 */
public class CalculatePiTest {

	@Test
	public void testCalculate() {
		Fibonnacci f = new Fibonnacci();
		
		BigInteger[] result = f.calculate(0);
		assertEquals(0, result.length);
		
		result = f.calculate(1);
		assertEquals(BigInteger.valueOf(0), result[0]);

		result = f.calculate(2);
		assertEquals(BigInteger.valueOf(0), result[0]);
		assertEquals(BigInteger.valueOf(1), result[1]);

		result = f.calculate(3);
		assertEquals(BigInteger.valueOf(0), result[0]);
		assertEquals(BigInteger.valueOf(1), result[1]);
		assertEquals(BigInteger.valueOf(1), result[2]);
		
		result = f.calculate(4);
		assertEquals(BigInteger.valueOf(0), result[0]);
		assertEquals(BigInteger.valueOf(1), result[1]);
		assertEquals(BigInteger.valueOf(1), result[2]);
		assertEquals(BigInteger.valueOf(2), result[3]);

		result = f.calculate(6);
		assertEquals(BigInteger.valueOf(0), result[0]);
		assertEquals(BigInteger.valueOf(1), result[1]);
		assertEquals(BigInteger.valueOf(1), result[2]);
		assertEquals(BigInteger.valueOf(2), result[3]);
		assertEquals(BigInteger.valueOf(3), result[4]);
		assertEquals(BigInteger.valueOf(5), result[5]);

	}

}
