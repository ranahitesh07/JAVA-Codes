abstract class Figure {
double dim1, dim2;
Figure(double dim1, double dim2) {
this.dim1 = dim1;
this.dim2 = dim2;
}
abstract double getArea();
}
class Rectangle extends Figure {
Rectangle(double dim1, double dim2) {
super(dim1, dim2);
}
@Override
double getArea() { 
return dim1 * dim2;
}
}
class Triangle extends Figure {
Triangle(double dim1, double dim2) {
super(dim1, dim2);
}
@Override
double getArea() {
return 0.5 * dim1 * dim2;
}
}
public class DriverFigure {
public static void main(String[] args) {
Figure fig;
fig = new Rectangle(10, 20);
System.out.println("Rectangle Area: " + fig.getArea());
fig = new Triangle(10, 20);
System.out.println("Triangle Area: " + fig.getArea());
}
}