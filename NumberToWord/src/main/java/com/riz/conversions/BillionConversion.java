package com.riz.conversions;

import com.riz.util.ConversionUtil;
import com.riz.util.NumberRange;

public class BillionConversion implements Conversion {

	@Override
	public String convertToWord(String number) {
		int numberToBeConvertedInBillion = Integer.parseInt(number.substring(0, 3));
		Conversion conversion= ConversionFactory.getConverter(NumberRange.MILLION);
		return ConversionUtil.getNumberInWords(numberToBeConvertedInBillion)+ "Billion " + conversion.convertToWord(number.substring(3));
	}
}
