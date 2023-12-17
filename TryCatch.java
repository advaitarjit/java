/*
 * File         :  TryCatch.java
 * Description  :  Java program to implement usage of Try,Catch and Finally
 * Author       :  Advait Arjit S
 * Version      :  1.0
 * Date         :  07/11/2023
 */
package advait;
import java.io.IOException;
import java.util.Scanner;
public class TryCatch {
public static void main(String [] args) {
	System.out.println("Program to perform Division");
	Scanner sc=new Scanner(System.in);
	char ch='y' ;
	do {
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	System.out.println("Enter second number");
	int num2=sc.nextInt();
	try {
	    int res=num1/num2;
	    System.out.println("Result="+res);
	}
	catch(Exception e){
		System.out.println("Division by Zero");
	}
	finally {
		System.out.println("End of Operation");
	}
	System.out.println("Do you want to Continue?(y/n)");
	ch=sc.next().charAt(0);
	}while(ch=='y');
}
}
