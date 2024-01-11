/*import java.util.Scanner;

public class fueling {
}
import javax.swing.*;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to refuel 5 litres? Type CONTINUE if yes and END if you want to finish ");
        String input = scanner.next();
        double fuelAmount = 0, cost = 0, moneyReceived, amountMissing, amountOver, moneyAdded;
        while (input.equalsIgnoreCase("continue")) {
            fuelAmount += 5;
            cost += 10;
            System.out.println("You have added 5 litres of petrol. Now you have " + fuelAmount + " litres of petrol. Total cost " + cost + " $.");
            System.out.println("Would you like to refuel? Type CONTINUE if yes and END if you want to finish ");
            input = scanner.next();}

        if (input.equalsIgnoreCase("end")) {
            System.out.println("Finished. Your total cost is " + cost + " and you filled your tank with " + fuelAmount + " litres of petrol.");


            System.out.println("Your total is " + cost + "$. Please enter money amount: ");
            moneyReceived = scanner.nextDouble();


            if (moneyReceived == cost) {
                System.out.println("You paid in full. Have a nice day");
            }
            while (moneyReceived < cost) {
                amountMissing = cost - moneyReceived;
                ;
                System.out.println("You paid " + moneyReceived + ". You still need to pay " + amountMissing + "$. Please insert more money");
                System.out.println("Please insert extra money amount: ");
                moneyAdded = scanner.nextDouble();
                moneyReceived = moneyAdded + moneyReceived;
                if (moneyReceived == cost) {
                    System.out.println("You paid in full. Have a nice day");
                }
            }
            if (moneyReceived > cost) {
                amountOver = moneyReceived - cost;
                System.out.println("You paid " + moneyReceived + ". Your change is " + amountOver + "$. Have a nice day!");
            }
        }
    }
}
*/


