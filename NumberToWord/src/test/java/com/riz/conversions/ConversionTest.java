package com.riz.conversions;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversionTest {

	@Test
	public void testZero() {
		
			assertEquals( "", Conversion.getNumberInWords(0));
			assertNull("Returns null for input 0", Conversion.getNumberInWords(0));
		}
	
	@Test
	public void testHundred() {
		
		assertEquals( "One Hundred", Conversion.getNumberInWords(100));
	}
	
	@Test
	public void testRandom(){
		
		assertNotNull(Conversion.getNumberInWords(getRandom(0, 999)));
	}
	
	public int getRandom(int min, int max)
	{
		return (int)(Math.random()*((max-min)+1))+min;
	}

}
