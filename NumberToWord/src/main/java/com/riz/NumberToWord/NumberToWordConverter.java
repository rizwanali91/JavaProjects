package com.riz.NumberToWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.riz.util.ConversionUtil;
import com.riz.util.InvalidInputException;;

public class NumberToWordConverter {
	
	public static void main(String args[])
	{
		System.out.println("Please enter a valid number. Valid range 0 to 999,999,999,999,999");
		BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));
		 
		try {
			String numberToBeConverted = bufferedreader.readLine();
			
			numberToBeConverted = ConversionUtil.removeLeadingZeros(numberToBeConverted);
			
			if(!ConversionUtil.isValidInput(numberToBeConverted))
				throw new InvalidInputException("Invalid input. Valid range 0 to 999,999,999,999,999");
			
			ConversionService conversionService = new ConversionService();
			
			if(!numberToBeConverted.isEmpty())
				System.out.println("Number in Words is: "+ conversionService.convert(numberToBeConverted));
			else 
				System.out.println("Number in Words is: Zero");
		
		} catch (IOException e) 
		{
			e.printStackTrace();
		}catch(InvalidInputException e)
		{
			e.printStackTrace();
		}		
	}	
}
