package com.riz.conversions;

import com.riz.util.ConversionUtil;
import com.riz.util.NumberRange;

public class MillionConversion implements Conversion {

	@Override
	public String convertToWord(String number) {
		// TODO Auto-generated method stub
		int numberToBeConvertedInMillion = Integer.parseInt(number.substring(0, 3));
		Conversion conversion= ConversionFactory.getConverter(NumberRange.THOUSAND);
		return ConversionUtil.getNumberInWords(numberToBeConvertedInMillion)+ "Million " + conversion.convertToWord(number.substring(3));
	}

}
