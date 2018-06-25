package com.statckroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionCreationTest {

	@Test
	public void testFirstException() {
		ExceptionCreation ec= new ExceptionCreation();
		String actual=ec.firstException();
		assertEquals("java.lang.NegativeArraySizeException", actual);
	}

	@Test
	public void testSecondException() {
		ExceptionCreation ec= new ExceptionCreation();
		String actual =ec.secondException();
		assertEquals("java.lang.ArrayIndexOutOfBoundsException", actual);
		}

	@Test
	public void testThirdException() {
		ExceptionCreation ec= new ExceptionCreation();
		String actual=ec.thirdException();
		assertEquals("java.lang.NullPointerException", actual);
	}

}
