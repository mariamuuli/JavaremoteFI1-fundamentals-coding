import java.util.Scanner;

public class FizzBuzz {
    public FizzBuzz(int input) {
        int i = 0;
        while (i <= input) {
            if (i % 3 == 0 && i %7 == 0) {
                System.out.println("Fizz buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 7 == 0) {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
            i++;
        }

    }
}
/*Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
                int input = scanner.nextInt();
                new FizzBuzz(input); */

