class Figure {
double dim1, dim2;
Figure(double dim1, double dim2) {
this.dim1 = dim1;
this.dim2 = dim2;
}
double area() {
return 0;
}
}
class Rectangle extends Figure {
Rectangle(double dim1, double dim2) {
super(dim1, dim2);
}
@Override
double area() {
return dim1 * dim2;
}
}
class Triangle extends Figure {
Triangle(double dim1, double dim2) {
super(dim1, dim2);
}
@Override
double area() {
return 0.5 * dim1 * dim2;
}
}
class Square extends Figure {
Square(double side) {
super(side, side);
}
@Override
double area() {
return dim1 * dim2;
}
}
public class Driver {
public static void main(String[] args) {
Figure f;
f = new Rectangle(5, 10);
System.out.println("Area of Rectangle: " + f.area());
f = new Triangle(5, 10);
System.out.println("Area of Triangle: " + f.area());
f = new Square(7);
System.out.println("Area of Square: " + f.area());
}
}