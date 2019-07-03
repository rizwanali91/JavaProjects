package com.riz.NumberToWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import com.riz.conversions.Conversion;
import com.riz.conversions.ConversionFactory;
import com.riz.util.InvalidInputException;
import com.riz.util.NumberRange;

public class NumberToWordConverter {
	
	public static void main(String args[])
	{
		System.out.println("Please enter a valid number. Valid range 0 to 999,999,999,999,999");
		BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));
		String numberToBeConverted;
		try {
			numberToBeConverted = bufferedreader.readLine();
			// Remove Leading Zeros if any
			numberToBeConverted = removeLeadingZeros(numberToBeConverted);
			
			//Check if the input is a number and within supported Range
			Pattern numberPattern = Pattern.compile("\\d{0,16}");
			if(numberToBeConverted== null || !numberPattern.matcher(numberToBeConverted).matches())
				throw new InvalidInputException("Please enter a valid number. Valid range 0 to 999,999,999,999,999");
			
			//Print the number in words
			System.out.println("Number in Words is: "+ convert(numberToBeConverted));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(InvalidInputException e)
		{
			e.printStackTrace();
		}		
	}
	
	private static String convert(String numberToBeConverted)
	{
		NumberRange numberRange = getConversionReference(numberToBeConverted);
		Conversion conversion= ConversionFactory.getConverter(numberRange);
		
		return conversion.convertToWord(numberToBeConverted);
		
	}
	private static NumberRange getConversionReference(String NumberToBeConverted)
	{
		int numberLength= NumberToBeConverted.length();
		System.out.println("Number length "+ numberLength);
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
	
	private static String removeLeadingZeros(String NumberToBeConverted)
	{
		int i = 0; 
        while (i < NumberToBeConverted.length() && NumberToBeConverted.charAt(i) == '0') 
            i++; 
  
        StringBuffer sb = new StringBuffer(NumberToBeConverted); 

        sb.replace(0, i, ""); 
  
        return sb.toString(); 
	}
	
}
