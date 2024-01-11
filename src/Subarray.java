import java.util.Scanner;

/*public class Subarray

//Task 16.
//Write an application that takes 10 numbers from the user (type int) and write the length of the longest such
// subsequence of these numbers, which is increasing.
//For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5" as the length of
// the longest increasing subsequence (underlined in the example).
import java.util.Scanner;
    /* SUBSEQUENCE EX!*/
    /*public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int Array[] = new int[10];
            System.out.println("Give the numbers");
            int i, max = Array[0],counter = 0, maxCounter = 0;
            for (i = 0; i < Array.length; i++) {
                Array[i] = scanner.nextInt();
                if (max < Array[i]){
                    counter++;
                    max = Array[i];
                    maxCounter = counter;
                    if(maxCounter< counter){
                        maxCounter = counter;
                    }
                }
                else if(max >= Array[i]){
                    max = Array[i];
                    if (maxCounter< counter){
                        maxCounter = counter;
                        counter = 1;
                    }

                }
            }System.out.println("Longest subsequence of increasing numbers is: " + maxCounter);
        }
    }
    // max counter lisaks, counter muutub maxcounteriks kui counter on suurem kui maxcounter
    /* kas Array[0] või 0? Kui on array 0 ja esimene element kohe 1000, siis ei hakkagi counterile liitma?, */


