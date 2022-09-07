package Arrays;

import java.util.Scanner;

public class MatrixSearch2 {
    public static void main(String[] args) {
        System.out.println("Enter the no. of rows!");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the no. of cols!");
        int cols = sc.nextInt();
        // declare array
        System.out.println("Enter the values of the matrix.");
        int[][] arr = new int[rows][cols];
        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        // search
        System.out.println("Enter the value to find.");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (x == arr[i][j]) {

                    System.out.println("x is found in location: " + i + ", " + j);
                }
            }
        }

        // print
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
