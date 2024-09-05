 
package JavaAsignment;
 
 
import java.util.Scanner;

public class problem5d {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        System.out.println("Enter Your Number: ");
        int n = inputScanner.nextInt();
        inputScanner.close();

        int i, j, s;

        for (i = n; i >= 1; i--) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            if (n - i > 0) {
                for (s = 1; s <= (n - i) * 2; s++) {
                    System.out.print(" ");
                }
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            if (n - i > 0) {
                for (s = 1; s <= (n - i) * 2; s++) {
                    System.out.print(" ");
                }
            }

            for (j = 1; j <= i; j++) { 
                System.out.print("*");
            }

            System.out.println();
        }
    }
}