package edu.seecs.lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestTest 
{

	@Test
	public final void testAddTest() {
		Matrix calc = new Matrix();
        assertEquals(70, calc.Addition());
	}

	@Test
	public final void testMultiplyTest() {
		Matrix calc = new Matrix();
        assertEquals(120, calc.Multiplication());
	}

	@Test
	public final void testExtraTest() {
		Matrix calc = new Matrix();
        assertEquals(60, calc.dualOperations());
	}

}
