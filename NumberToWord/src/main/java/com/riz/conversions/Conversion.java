package com.riz.conversions;

import java.util.HashMap;

public interface Conversion {
	
	static final HashMap<Integer, String> numberMap= new HashMap<Integer, String>(){/**
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
		put(11,"Eleven");
		put(12,"Twelve");
		put(13,"Thirteen");
		put(14,"Fourteen");
		put(15,"Fifteen");
		put(16,"Sixteen");
		put(17,"Seventeen");
		put(18,"Eighteen");
		put(19,"Nineteen");
		put(10,"Ten");
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
	
	public String convertToWord(String number);
	
	public static String getNumberInWords(int subStringToBeConverted)
	{
		Integer digitToBeConverted=new Integer(0);
		StringBuilder convertedString=new StringBuilder();
		int numberOfDigits= String.valueOf(subStringToBeConverted).length();
		// Returns empty string for Zero
		
		for(int i=100; i>0; i=i/10)
		{
			digitToBeConverted= subStringToBeConverted/i;
			if(subStringToBeConverted>99) {
				convertedString.append(numberMap.get(digitToBeConverted)+" ");
				convertedString.append("Hundred ");
			}
			else if(subStringToBeConverted>19)
			{
				if(numberOfDigits==3)
					convertedString.append("and ");
				convertedString.append(numberMap.get(digitToBeConverted*10)+" ");
			}
			else if(subStringToBeConverted<20 && subStringToBeConverted>9)
			{
				i=0;
				if(numberOfDigits==3)
					convertedString.append("and ");
				convertedString.append(numberMap.get(subStringToBeConverted)+" ");
			}
			else if(subStringToBeConverted<10 && subStringToBeConverted>0)
			{
				convertedString.append(numberMap.get(digitToBeConverted)+" ");
			}
			subStringToBeConverted%=i;
		}
		return convertedString.toString();
	}

}
