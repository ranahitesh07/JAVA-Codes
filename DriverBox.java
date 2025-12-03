import java.util.*;

class Box {
	double width, height, depth;
	
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	double volume() {
		return width * height * depth;
	}
}

public class DriverBox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter box width: ");
		double width = sc.nextDouble();
		System.out.print("Enter box height: ");
		double height = sc.nextDouble();
		System.out.print("Enter box depth: ");
		double depth = sc.nextDouble();
		Box b1 = new Box(width, height, depth);
		System.out.println("Volume of the box: " + b1.volume());
		}
}

