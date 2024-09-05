
import java.util.Scanner;

public class probleme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        int size = 2 * n - 1;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < n; i++) {
            int fillValue = n - i;
            for (int j = i; j < size - i; j++) {
                for (int k = i; k < size - i; k++) {
                    matrix[j][k] = fillValue;
                }
            }
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}