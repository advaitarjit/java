/*
 * File         :  Tokenizer.java
 * Description  :  Java program to implement StringTokenizer
 * Author       :  Advait Arjit S
 * Version      :  1.0
 * Date         :  01/12/2023
 */
package advait;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer {
	public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Integers:");
String data=sc.nextLine();
int sum=0;
StringTokenizer sr=new StringTokenizer(data,",");
while(sr.hasMoreTokens()) {
	String token=sr.nextToken();
	int num=Integer.parseInt(token);
		sum+=num;
	}System.out.println("sum="+sum);
}
}
