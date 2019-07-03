package com.riz.conversions;

import com.riz.util.NumberRange;

public class ConversionFactory {
	
	public static Conversion getConverter(NumberRange numberRange)
	{
		switch (numberRange) {
		case TRILLION:
			return new TrillionConversion();
		case BILLION:
			return new BillionConversion();
		case MILLION:
			return new MillionConversion();
		case THOUSAND:
			return new ThousandConversion();
		case HUNDRED:
			return new HundredConversion();
		default:
			throw new UnsupportedOperationException("Conversion provided is not supported");
		}
		
	}

}
