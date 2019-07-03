package com.riz.conversions;

import com.riz.util.ConversionUtil;

public class HundredConversion implements Conversion {

	@Override
	public String convertToWord(String number) {
		// TODO Auto-generated method stub
		int numberToBeConvertedInhundred = Integer.parseInt(number);
		return ConversionUtil.getNumberInWords(numberToBeConvertedInhundred);
	}

}
