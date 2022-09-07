package Arrays;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // operation
        boolean isAscending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending)

        {
            System.out.print("The array is in ascending order. ");
        }

        else {
            System.out.println("The array is not in ascending order. ");
        }
        sc.close();

    }
}
