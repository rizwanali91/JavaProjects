package com.riz.conversions;

import com.riz.util.ConversionUtil;
import com.riz.util.NumberRange;

public class BillionConversion implements Conversion {

	@Override
	public String convertToWord(String numberToBeConverted) {
		int subStringToBeConverted = Integer.parseInt(numberToBeConverted.substring(0, ConversionUtil.getOffset(numberToBeConverted)));
		Conversion conversion= ConversionFactory.getConverter(NumberRange.MILLION);

		if(subStringToBeConverted!=0)
			return Conversion.getNumberInWords(subStringToBeConverted)+ "Billion " + conversion.convertToWord(numberToBeConverted.substring(ConversionUtil.getOffset(numberToBeConverted)));
		return conversion.convertToWord(numberToBeConverted.substring(3));
	}
}
