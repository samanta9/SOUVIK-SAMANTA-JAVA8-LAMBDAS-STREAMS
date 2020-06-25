package epam.com.maven_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Tasks on Java 8 Lambdas and Streams
 * 
 * 3. Given a list of Strings (that contains both palindromes and nonpalindromes), write a method that returns a list of all the palindrome
strings.
TIP: Use static method references of Functional Interfaces

 */


public class Palindrome {

	public static void main(String[] args) {
		
		// For User input code in /*...*/ section
		 
					/*
				        // To use this first import (import java.util.Scanner;) at the top

						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the number of element , you want to add : ");
						int n = sc.nextInt();
						String [] strArray = new String[n];
						System.out.println("Enter the "+n+" String to add in List : ");
						for(int i=0;i<n;i++) 
						{
							strArray[i] =sc.next();
						}
						sc.close();
						
						List<String> strList = Arrays.asList(strArray);
						
					*/
						
						
						
				// For program define list...
					  
				 List<String> strList = Arrays.asList("level", "abc", "radar", "refer", "souvik", "", "civic", "samanta", "madam");
					

					List <String> palindromeStrings = Palindrome.filterList(strList, StrPredicates::isPalindrome);
					System.out.println("THE PALINDROME STRING OF GIVEN LIST ARE :\n "+palindromeStrings);

	}
	
	
	  public static List<String> filterList(List<String> list, Predicate<String> predicate) {
		List<String> finalList = new ArrayList<String>();

		for (String str : list) {
		  if (predicate.test(str) ){
		  finalList.add(str);
		  }
		}
		return finalList;

}

}
