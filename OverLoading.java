/*
 * File         :  HelloJava.java
 * Description  :  Java program to study method of Overloading
 * Author       :  Advait Arjit S
 * Version      :  1.0
 * Date         :  13/10/2023
 */

import java.util.Scanner;
public class OverLoading{

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter height and base of triangle:");
			float height=sc.nextFloat();
			float base=sc.nextFloat();
			System.out.println("Enter radius of the circle:");
			float radius=sc.nextFloat();
			System.out.println("Enter length and breadth of the rectangle:");
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			Shape shape=new Shape();
			shape.area(height,base);
			shape.area(radius);
			shape.area(length,breadth);
		}
	}

}
class Shape{
	public void area(float height, float base) {
		System.out.println("Area of Triangle with base : "+base+" and heigth :"+height +"is : "+0.5*height*base);
	}
	public void area(float radius) {
	System.out.println("Area of circle with radius:"+ radius+" is :"+3.14*radius*radius);
	}
	public void area(int length,int breadth) {
		
		System.out.println("Area of rectangle with width :"+breadth+" and length :"+length+"is :"+length*breadth);
	}
}