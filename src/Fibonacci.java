public class Fibonacci {
    public void printFibonacciSeries (int input){
        System.out.printf("The fibonacci series of %d numbers: ", input);
        int secondToLast = 0, last = 1;
        System.out.println(secondToLast + " " + last + " ");

        for (int counter = 2; counter < input; counter ++){
            int current = secondToLast + last;
            secondToLast = last;
            last = current;
            System.out.println(current + " ");
        }

    }
}
