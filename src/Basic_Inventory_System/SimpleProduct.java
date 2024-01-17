package Basic_Inventory_System;

public class SimpleProduct implements Product{

    private double Price;
    private String productName;

    public SimpleProduct (String productName, float price) {
        this.productName = productName;
        this.Price = price;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product " + getProductName() + " costs " + getPrice());
    }
}