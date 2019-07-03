package com.riz.conversions;

import com.riz.util.ConversionUtil;
import com.riz.util.NumberRange;

public class TrillionConversion implements Conversion {

	@Override
	public String convertToWord(String number) {
		// TODO Auto-generated method stub
		int numberToBeConvertedInTrillion = Integer.parseInt(number.substring(0, 3));
		Conversion conversion= ConversionFactory.getConverter(NumberRange.BILLION);
		return ConversionUtil.getNumberInWords(numberToBeConvertedInTrillion)+ "Trillion " + conversion.convertToWord(number.substring(3));
	}

}
