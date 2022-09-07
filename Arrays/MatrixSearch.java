package Arrays;

import java.util.Scanner;

public class MatrixSearch {
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
        boolean isPresent = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (x == arr[i][j]) {
                    isPresent = true;
                }
            }
        }
        if (isPresent) {
            System.out.println(x + " is present in the matrix!");
        } else {
            System.out.println(x + " is not present in the matrix.");
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
