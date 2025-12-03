import java.util.Scanner;

class Complex {
	int real, imag;
	
	void initialise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real and imaginary parts:");
		real = sc.nextInt();
		imag = sc.nextInt();
	}
	
	void add(Complex ob1, Complex ob2) {
		real = ob1.real + ob2.real;
		imag = ob1.imag + ob2.imag;
	}
	void show() {
		System.out.println("Sum of complex number is: "+ real + " + i" + imag);
	}
}

public class Driver3 {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		
		System.out.println("Enter first complex number");
		c1.initialise();
		System.out.println("Enter second complex number");
		c2.initialise();
		
		c3.add(c1, c2);
		c3.show();
	}
}
