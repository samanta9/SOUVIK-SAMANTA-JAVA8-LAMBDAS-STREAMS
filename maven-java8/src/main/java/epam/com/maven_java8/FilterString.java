package epam.com.maven_java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Tasks on Java 8 Lambdas and Streams
 * 
 * 2. Given a list of Strings, write a method that returns a list of all strings that
start with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use
Java 8 Lambdas and Streams API's.

 */

public class FilterString {

	public static void main(String[] args) {
		
		// For User input code in /*...*/ section
		
				/*
				// To use this first import (import java.util.Scanner;) at the top
				 * 
			    Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of element , you want to add in list : ");
				int n = sc.nextInt();
				String [] strArray = new String[n];
				System.out.println("Enter the "+n+" String to add in List : ");
				for(int i=0;i<n;i++) 
				{
					strArray[i] =sc.next();
				}
				sc.close();
				
				*/
				
				// FOR predefine  LIST
				
				String [] strArray = {"", "aaa", "aa", "a", "aba", "abc", "baa", "bca", "acab", "bbb"};

			     List<String> strList = Arrays.asList(strArray);
			     
				 List<String> listSearch = search(strList);
			    System.out.println(" The list of all strings that start with the letter 'a' and have exactly 3 letters are : \n "+ listSearch);
			}

				public static List<String> search(List<String> strList)
				{
					return strList.stream()
							.filter(s -> s.startsWith("a"))
							.filter(s -> s.length()==3)
							.collect(Collectors.toList());
			     }
}