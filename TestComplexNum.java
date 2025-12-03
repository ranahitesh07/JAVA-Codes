import java.util.*;

class ComplexNum {
	double real;
	double img;
	
	ComplexNum(double real, double img) {
		this.real = real;
		this.img = img;
	}
	
	void displayCompNumber() {
		if (img >= 0)
			System.out.println(real + " + " + img + "i");
		else
			System.out.println(real + " - " + (-img) + "i");
	}
	
	ComplexNum addCompNumber(ComplexNum c) {
		return new ComplexNum(this.real + c.real, this.img + c.img);
	}
}

public class TestComplexNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first complex number:");
		System.out.print("Real part: ");
		double r1 = sc.nextDouble();
		System.out.print("Imaginary part: ");
		double i1 = sc.nextDouble();
		
		System.out.println("Enter second complex number:");
		System.out.print("Real part: ");
		double r2 = sc.nextDouble();
		System.out.print("Imaginary part: ");
		double i2 = sc.nextDouble();
		
		ComplexNum c1 = new ComplexNum(r1, i1);
		ComplexNum c2 = new ComplexNum(r2, i2);
		
		System.out.print("First Complex Number: ");
		c1.displayCompNumber();
		System.out.print("Second Complex Number: ");
		c2.displayCompNumber();
		
		ComplexNum sum = c1.addCompNumber(c2);
		System.out.print("Sum of Complex Numbers: ");
		sum.displayCompNumber();
	}
}
