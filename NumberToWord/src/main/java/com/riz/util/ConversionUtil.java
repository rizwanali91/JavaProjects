package com.riz.util;

import java.util.regex.Pattern;

public class ConversionUtil {
	
	public static int getOffset(String numberToBeConverted)
	{
		if(numberToBeConverted.length()%3 == 0)
			return 3;
		return numberToBeConverted.length()%3;
	}
	
	public static NumberRange getConversionReference(String NumberToBeConverted)
	{
		int numberLength= NumberToBeConverted.length();
		if(numberLength<16 && numberLength>12)
			return NumberRange.TRILLION;
		else if(numberLength<13 && numberLength>9)
			return NumberRange.BILLION;
		else if(numberLength<10 && numberLength>6)
			return NumberRange.MILLION;
		else if(numberLength<7 && numberLength>3)
			return NumberRange.THOUSAND;
		else 
			return NumberRange.HUNDRED;
	}
	
	public static String removeLeadingZeros(String NumberToBeConverted)
	{
		int i = 0; 
        while (i < NumberToBeConverted.length() && NumberToBeConverted.charAt(i) == '0') 
            i++; 
  
        StringBuffer sb = new StringBuffer(NumberToBeConverted); 

        sb.replace(0, i, ""); 
  
        return sb.toString(); 
	}
	
	public static boolean isValidInput(String inputToBeChecked)
	{
		Pattern numberPattern = Pattern.compile("\\d{0,16}");
		if(inputToBeChecked== null || !numberPattern.matcher(inputToBeChecked).matches())
			return false;
		return true;
	}		
}
