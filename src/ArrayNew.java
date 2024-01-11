/*
Write a program that does the following(the code should be written in separate methods):
1.Generated an array with 10 elements random between 0 and 99. (See Random class in java).
2.Display the generated array.
3.Display only the odd numbers.
4.Display only the even numbers.
 */
public class ArrayNew {

    private final int array [] = new int[10];


    public void array(){}

    public void randomGenerator() {
        System.out.println("Generating the random 10 elements between between numbers 0-99 ");
        for (int i = 0; i < array.length; i++) {
            int range = 100;
            array[i] = (int) (Math.random() * range);

            System.out.println("Element " + (i + 1) + " is " + array[i] );

        }
    }
    public void oddNumbers (){
        System.out.println("Odd numbers are the following: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                System.out.println("Number " + i + " element is odd number " + array[i]);
            }
        }
        }
        public void evenNumbers() {
            System.out.println("Even numbers are the following: ");
            for (int i = 0; i < array.length; i++){
                if (array[i] % 2 == 0) {
                    System.out.println( "Number " + i + " elemnt is even number " + array[i]);
                }
            }
    }
}
//ArrayNew array = new ArrayNew();
//array.randomGenerator();
//array.evenNumbers();
//array.oddNumbers();


