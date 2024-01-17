package Shapes;

public class Triangle implements Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double base, double height, double side1, double side2, double side3){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        return base * height /2;
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public void displayInfo() {
        System.out.println("The area of a triangle is: " + calculateArea());
        System.out.println("The perimeter of a triangle is: " + calculatePerimeter());
    }
}

