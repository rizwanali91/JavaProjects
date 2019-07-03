package com.riz.conversions;

public class HundredConversion implements Conversion {

	@Override
	public String convertToWord(String numberToBeConverted) {
		// TODO Auto-generated method stub
		int subStringToBeConverted = Integer.parseInt(numberToBeConverted);
		
		if(subStringToBeConverted!=0)
			return Conversion.getNumberInWords(subStringToBeConverted);
		return "";
	}

}
