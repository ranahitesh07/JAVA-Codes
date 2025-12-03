import java.util.Scanner;

abstract class Shape {
	abstract void RectangleArea(double length, double breadth);
	abstract void SquareArea(double side);
	abstract void CircleArea(double radius);
}

class Area extends Shape {
	void RectangleArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}
	
	void SquareArea(double side) {
		double area = side * side;
		System.out.println("Area of Square: " + area);
	}
	
	void CircleArea(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
}

public class DriverArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
		
		System.out.print("Enter the length of rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter the breadth of rectangle: ");
		double breadth = sc.nextDouble();
		System.out.print("Enter the side of square: ");
		double side = sc.nextDouble();
		System.out.print("Enter the radius of circle: ");
		double radius = sc.nextDouble();
		System.out.print("-------------------------------\n");
		a.RectangleArea(length, breadth);
		a.SquareArea(side);
		a.CircleArea(radius);
		
		sc.close();
	}
}
