package Shopping;

public class ShoppingCart {
    private Product[] products;
    public float totalPrice;
    private boolean isPaid;

    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
/*
package Shopping;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Apple");
        product.setPrice(3.132F);

        Product product1 = new Product();
        product1.setName("Vodka");
        product1.setPrice(34.1F);

        Product product2 = new Product();
        product2.setName("Wine");
        product2.setPrice(12.5F);

        Product product3 = new Product();
        product3.setName("Curd Snack");
        product3.setPrice(1F);

        Product product4 = new Product();
        product4.setName("Cheese");
        product4.setPrice(5.55F);

        Product product5 = new Product();
        product5.setName("Yogurt");
        product5.setPrice(1.99F);

        Product product6 = new Product();
        product6.setName("Bread");
        product6.setPrice(0.99F);

        Product product7 = new Product();
        product7.setName("Water");
        product7.setPrice(1.05F);

        Product product8 = new Product();
        product8.setName("Meat");
        product8.setPrice(5.55F);

        Product product9 = new Product();
        product9.setName("Chocolate");
        product9.setPrice(4.25F);

        System.out.printf("Items available " + "\n" + product.getName()+ " " + product.getPrice() + "\n"+ product1.getName() + " " + product1.getPrice() + "\n"+
                product2.getName()+ " " + product2.getPrice() + "\n"+  product3.getName() + " " + product3.getPrice() + "\n"+
                product4.getName()+ " " + product4.getPrice()+ "\n"+ product5.getName() + " " + product5.getPrice() + "\n"+
                product6.getName() + " " + product6.getPrice() + "\n"+ product7.getName() + " " + product7.getPrice()
                + "\n"+ product8.getName() + " " + product8.getPrice() + "\n"+ product9.getName() + " " + product9.getPrice());

        Product[] productsMenu = new Product[]{product, product1, product2, product3, product4, product5, product6, product7, product8};

        for (int i = 0; i < productsMenu.length; i++){
            System.out.println(i + " " + productsMenu[i].getName() + ": " + productsMenu[i].getPrice() + " EUR");
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setProducts(productsMenu);

        Scanner scanner = new Scanner(System.in);
int i = 0;
        while (i < 5) {
            System.out.println("Give me an item you wish to purchase: ");
            String input = scanner.nextLine();
            i++;
            if (input.equalsIgnoreCase("apple")){
                shoppingCart.totalPrice = product.getPrice() + shoppingCart.totalPrice;}
            if (input.equalsIgnoreCase("meat")){
                shoppingCart.totalPrice = product8.getPrice() + shoppingCart.totalPrice;}
            if (input.equalsIgnoreCase("vodka")){
                shoppingCart.totalPrice = product1.getPrice() + shoppingCart.totalPrice;}
            if (input.equalsIgnoreCase("wine")){
                shoppingCart.totalPrice = product2.getPrice() + shoppingCart.totalPrice;}


            System.out.println(shoppingCart.totalPrice);
        }


        }


            }




 */