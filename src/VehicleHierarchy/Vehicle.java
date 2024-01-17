package VehicleHierarchy;

public class Vehicle {

    private String brand;
    private String model;
    private int year;
    private String colour;

    public Vehicle (String brand, String model, int year, String colour){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }
    public void displayInfo(){
        System.out.println("The brand is " + brand + " and the model is " + model + ". Vehicle was manufactured in the " + year + " and it was painted " + colour + " :)");

    }
}

