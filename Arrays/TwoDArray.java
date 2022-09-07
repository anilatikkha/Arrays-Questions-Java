package Arrays;

import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter the rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter the columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        // input
        System.out.print("Enter the values!");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        // print
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
