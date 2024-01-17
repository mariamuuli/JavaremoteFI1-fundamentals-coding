package Basic_Inventory_System;

public class SimpleInventoryManager implements InventoryManager{

    private Product product;

    public SimpleInventoryManager (){

    }

    @Override
    public void addProduct(Product product) {
        this.product = product;
    }
    @Override
    public void removeProduct(Product product) {
        this.product = product;
        System.out.println("You bought ");
        product.displayDetails();

    }

    @Override
    public void displayInventory() {
        System.out.println("Inventory ");
        product.displayDetails();

    }
}
