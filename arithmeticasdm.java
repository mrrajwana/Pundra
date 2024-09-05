
import java.util.Scanner;


public class arithmeticasdm {
 public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int fn = inputScanner.nextInt();

        System.out.println("Enter Second Number: ");
        int sn = inputScanner.nextInt();

        inputScanner.close();

        System.out.println("The Addition of the Number: " + (fn+sn));


        System.out.println("The Subtraction of the Number: " + (fn - sn));



        System.out.println("The Multiplication of the Number: " + (fn * sn));


        System.out.println("The Division of the Number: " + (fn / sn));

        System.out.println("The Modulus of the Number: " + (fn % sn));
    }

}
