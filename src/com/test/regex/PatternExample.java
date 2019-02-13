package com.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	//.(dot) means any single character 
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	Pattern pattern = Pattern.compile(".xx.");
		
		Matcher matcher = pattern.matcher("Mxxx");
		
		System.out.println("Input string matches the regex :"+matcher.matches());
		
		
		 * bad regular expression
		 * Pattern pattern2 = Pattern.compile("*xx*");
		 
	
		String str="xbbd";
		
		System.out.println("Using string matches method : "+str.matches("bb.d"));
		
		System.out.println("Using pattern matches method : "+pattern.matches(".bbd", str));
	*/
		
	/**	
	 * this is used for matches at the beginning of the line ^xxx		
		Pattern pattern = Pattern.compile("^abb.e");
		Matcher matcher = pattern.matcher("abbde");
		boolean result = matcher.matches();
	
		System.out.println(result);
	**/
		/**
		 * this code used for matching regex xxx$ at the end of the line
		Pattern pattern = Pattern.compile("..ffff$");
		Matcher matcher = pattern.matcher("abffff");
		boolean result = matcher.matches();
		System.out.println(result);
		
			**/		
		

		/*[abc] can match any of the letter a,b or c [] are known as character class
	*/
		
		/*Pattern pattern = Pattern.compile("[abcd]..");
		Matcher matcher = pattern.matcher("apn");
		boolean result = matcher.matches();
		System.out.println(result);
		*/
		/*
		Pattern pattern = Pattern.compile("[abcd].[12]");
		Matcher matcher = pattern.matcher("av2");
		boolean result = matcher.matches();
		System.out.println(result);*/
		/**
		When ^ is the first character in [], 
		it negates the pattern, 
		matches anything except a, b or c
		**/
		/*Pattern pattern = Pattern.compile("[^ash]");
		Matcher matcher = pattern.matcher("m");
		boolean result = matcher.matches();
		System.out.println(result);*/
		
		/**
		 * [a-e1-8]
		 * Matches ranges between a to e OR 1 to 8
		 */
		/*Pattern pattern = Pattern.compile("[a-e1-8].");
		Matcher matcher = pattern.matcher("b#");
		boolean result = matcher.matches();
		System.out.println(result);*/
		/**		
		 * xx|yy
		 * 	Matches regex xx or yy
		**/
		//this logic called pattern matching logic
		/*Pattern pattern = Pattern.compile("asha|praveen|kiran|andy|bob");
		Matcher matcher = pattern.matcher("bob");
		boolean result = matcher.matches();
		System.out.println(result);
		*/
		
		//Java Regex Metacharacters
		
		//we have some metacharacters in java regex,it's like shotcodes for common matching patterns
		
		/**
		 * \d-any digits short of[0-9]
		 * \s-any whitespace character
		 * \w -any word character short for [a-zA-Z0-9]
		 * 
		 */
		
		//Regular Expression in java:Quantifiers
		
		//java regex quantifiers specify the number of occurrences of the character to match against the input string.
		
		/**
		 * x?- x occurs once or not at all
		 *  x*-x occurs zero or more times
		 * x+ -x Occurs one or more times
		 * x{n} -x occurs exactly n times
		 * x{n,} x occurs n or more times
		 * 
		 * x{n,m} -x occurs at leat n times but not more than m times.
		 * 
		 */
		Pattern pattern = Pattern.compile("[aeiou]");
		
	String str="praveen";
	int count=0;
	for(int i=0;i<str.length();i++){
		Character c = str.charAt(i);
		Matcher matcher = pattern.matcher(c.toString());
		if(matcher.matches()){
			count+=1;
			}
	}
	System.out.println("number of vowels in the string "+str+" are :  "+count);
		/*Pattern pattern = Pattern.compile("[aeiou]");
		Matcher matcher = pattern.matcher("");
		boolean result = matcher.matches();
		System.out.println(result);
		*/
		
		
		
	}
	
	
}
