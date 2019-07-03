package com.riz.util;

import java.util.HashMap;

public class ConversionUtil {
	
	private static final HashMap<Integer, String> numberMap= new HashMap<Integer, String>(){/**
		 * 
		 */
		private static final long serialVersionUID = -3261878165760117908L;

	{
		put(0,"");
		put(1,"One");
		put(2,"Two");
		put(3,"Three");
		put(4,"Four");
		put(5,"Five");
		put(6,"Six");
		put(7,"Seven");
		put(8,"Eight");
		put(9,"Nine");
		put(20,"Twenty");
		put(30,"Thirty");
		put(40,"Forty");
		put(50,"Fifty");
		put(60,"Sixty");
		put(70,"Seventy");
		put(80,"Eightty");
		put(90,"Ninety");
			}
	};
	
	public static String getNumberInWords(int numberToBeConverted)
	{
		Integer digitToBeConverted=new Integer(0);
		StringBuilder convertedString=new StringBuilder();
		// Returns empty string for Zero
		for(int i=100; i>0; i=i/10)
		{
			digitToBeConverted= numberToBeConverted/i;
			if(numberToBeConverted>99) {
				convertedString.append(numberMap.get(digitToBeConverted)+" ");
				convertedString.append("Hundred ");
			}else if(numberToBeConverted>10)
			{
				convertedString.append("and ");
				convertedString.append(numberMap.get(digitToBeConverted*10)+" ");
			}
			else
			{
				convertedString.append(numberMap.get(digitToBeConverted)+" ");
			}
			numberToBeConverted%=i;
		}
		return convertedString.toString();
	}
	
	public static void main(String args[])
	{
		System.out.println(getNumberInWords(000));
	}
		
}
