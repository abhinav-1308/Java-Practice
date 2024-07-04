class Shape {
    protected double dim1;
    protected double dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getDim1() {
        return dim1;
    }

    public double getDim2() {
        return dim2;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    public double findArea() {
        return 0.5 * dim1 * dim2;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double findArea() {
        return dim1*dim2;
    }
}

public class Demo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println("Area of triangle: " + triangle.findArea());
        System.out.println("Area of rectangle: " + rectangle.findArea());
    }
}