package Arrays;

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
            if (n[i] > max) {
                max = n[i];
            }
            sc.close();
        }
        System.out.println("The minimum value is: " + min);

        System.out.println("The maximum value is: " + max);
    }
}
