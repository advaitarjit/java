/*
 * File         :  HelloJava.java
 * Description  :  Java program to study Abstract class
 * Author       :  Advait Arjit S
 * Version      :  1.0
 * Date         :  20/10/2023
 */

public class Abstract {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		Hexagon hex = new Hexagon();
		rec.numberOfSides();
		tri.numberOfSides();
		hex.numberOfSides();
	}
}
abstract class Shapes {
	abstract void numberOfSides();
}
class Rectangle extends Shape {
	void numberOfSides() {
		System.out.println("Rectangle has 4 sides.");
	}
}
class Triangle extends Shape {
	void numberOfSides() {
		System.out.println("Triangle has 3 sides.");
	}
}
class Hexagon extends Shape {
void numberOfSides() {
		System.out.println("Hexagon has 6 sides.");
	}
}
