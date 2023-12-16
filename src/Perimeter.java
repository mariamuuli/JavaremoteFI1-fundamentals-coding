import java.lang.Math;

public class Perimeter {
    //private final float PI = 3.14f;


    public double calculatePerimeter(float diameter){
        /*float radius = diameter /2;
        double perimeter = 2 * Math.PI * diameter; */
        return 2 * Math.PI *(diameter /2);
    }
}
//Perimeter perimeter = new Perimeter();
//        double resultPerimeter = perimeter.calculatePerimeter(3.1234f);
//        System.out.println(resultPerimeter);