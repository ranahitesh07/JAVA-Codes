import java.util.Scanner;

class Area {
	int l, b;
	
	void setDim(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	int getArea() {
		return l * b;
	}
}

public class Driver4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Area rectangle = new Area();
		
		System.out.print("Enter the length and breadth of the rectangle: ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		rectangle.setDim(length, breadth);
		
		int area = rectangle.getArea();
		
		System.out.println("Area of the rectangle: " + area);
		sc.close();
	}
}
