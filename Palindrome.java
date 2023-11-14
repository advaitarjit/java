/*
 * File         :  HelloJava.java
 * Description  :  Java program to check whether a givenstring is palindrome or not
 * Author       :  Advait Arjit S
 * Version      :  1.0
 * Date         :  19/09/2023
 */

import java.util.Scanner;

public class Palindrome {

public static void main(String [] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter a string");

			String input=sc.next();

			boolean isPalindrome=check(input);

			if(isPalindrome) {

				System.out.println("The given string is palindrome");

			}

			else{

				System.out.println("The given string is not palndrome");

			}

		}

}



                           

       

//

	private static boolean check(String input)

	{

		char[]charArray=input.toCharArray();

		int length=input.length();

		for(int i=0;i<length/2;i++)

		{

			if(charArray[i]!=charArray[length-i-1])

			{

			return false;	

		}

		}

		return true;

	}

}