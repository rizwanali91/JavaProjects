package com.riz.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversionUtilTest {

	@Test
	public void testGetOffset() {
		assertEquals(2, ConversionUtil.getOffset("12548"));
	}

	@Test
	public void testGetConversionReference() {
		assertEquals(NumberRange.BILLION, ConversionUtil.getConversionReference("12548785941"));
	}

	@Test
	public void testRemoveLeadingZeros() {
		assertEquals("123", ConversionUtil.removeLeadingZeros("000000123"));
	}

	@Test
	public void testIsValidInputSuccess() {
		assertTrue(ConversionUtil.isValidInput("123465"));
	}
	
	@Test
	public void testIsValidInputWithAlphabets() {
		assertFalse(ConversionUtil.isValidInput("fasferfdxc"));
	}
	
	@Test
	public void testIsValidInputOutOfRange() {
		assertFalse(ConversionUtil.isValidInput("6546851685684568418641685"));
	}

}
