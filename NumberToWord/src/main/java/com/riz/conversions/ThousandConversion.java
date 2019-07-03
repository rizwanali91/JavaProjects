package com.riz.conversions;

import com.riz.util.ConversionUtil;
import com.riz.util.NumberRange;

public class ThousandConversion implements Conversion {

	@Override
	public String convertToWord(String number) {
		// TODO Auto-generated method stub
		int numberToBeConvertedInThousand = Integer.parseInt(number.substring(0, 3));
		Conversion conversion= ConversionFactory.getConverter(NumberRange.HUNDRED);
		return ConversionUtil.getNumberInWords(numberToBeConvertedInThousand)+ "Thousand " + conversion.convertToWord(number.substring(3));
	}

}
