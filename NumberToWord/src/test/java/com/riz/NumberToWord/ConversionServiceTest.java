package com.riz.NumberToWord;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversionServiceTest {
	
	ConversionService conversionService= new ConversionService();

	@Test
	public void testSuccess() {
		assertEquals("Two Thousand Five Hundred and Two", conversionService.convert("2502"));
	}
	

}
