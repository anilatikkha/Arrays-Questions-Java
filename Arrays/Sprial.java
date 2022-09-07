package Arrays;

import java.util.Scanner;

public class Sprial {
    public static void main(String[] args) {

        System.out.println("Please enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the number of colums.");
        int cols = sc.nextInt();

        // declare matrix
        int[][] arr = new int[rows][cols];

        // initialize matrix
        System.out.println("Enter the values of matrix.");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        // print matrix
        int n = arr.length - 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == n) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = arr.length - 2; j >= 0; j--) {
                if (j == 0 || i == n) {

                    System.out.print(arr[i][j] + " ");
                }
            }

        }
        sc.close();
    }
}
