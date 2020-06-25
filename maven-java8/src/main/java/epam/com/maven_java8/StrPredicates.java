package epam.com.maven_java8;
/**
 * Tasks on Java 8 Lambdas and Streams
 * 
 * second part of Q.3 StrPredicates and isPalindrome function define here...

 */

public class StrPredicates {
	
	public static boolean  isPalindrome(String str)
	{
		
		    if (str=="")
		    {
		       return false;
		    }
		
		  else 
		  {
			  String reverse = new StringBuilder(str).reverse().toString();
			  return str.equals(reverse);
		  }
		
		
	}

}
