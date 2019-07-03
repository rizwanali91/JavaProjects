package com.riz.conversions;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.riz.util.NumberRange;

public class ConversionFactoryTest {

	Conversion conversion;
	@Test
	public void testGetTrillionConverter() {
		conversion= ConversionFactory.getConverter(NumberRange.TRILLION);
		assertTrue( conversion instanceof TrillionConversion);
	}

}
