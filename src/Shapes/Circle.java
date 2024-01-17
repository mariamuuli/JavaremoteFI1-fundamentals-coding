package Shapes;

public class Circle implements Shape{
    private double radius;
    public Circle (double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
    return (radius * radius) * Math.PI;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void displayInfo() {
        System.out.println("The area of a circle is: " + calculateArea());
        System.out.println("The perimeter of a circle is: " + calculatePerimeter());
    }
}
