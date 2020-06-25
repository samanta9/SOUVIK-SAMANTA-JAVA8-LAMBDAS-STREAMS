package epam.com.maven_java8;

import java.util.Arrays;
import java.util.List;

/**
 * Tasks on Java 8 Lambdas and Streams
 * 
 * 1. Write a method that returns the average of a list of integers.
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	// This is  program define list you can update list .....
    	
		final List<Integer> listavg = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		listavg.stream() 
	    .mapToInt(i -> i) 
	    .average() 
	    .ifPresent(avg -> System.out.println("Average of the given list  is : " + avg));
    }
}
