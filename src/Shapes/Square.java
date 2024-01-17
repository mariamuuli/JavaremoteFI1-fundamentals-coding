package Shapes;

public class Square implements Shape{
    private double side;
    public Square (double side){
        this.side = side;
    }
    @Override
    public double calculateArea() {
    return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
    @Override
    public void displayInfo() {
        System.out.println("The area of a square is: " + calculateArea());
        System.out.println("The perimeter of a square is: " + calculatePerimeter());
    }
}
