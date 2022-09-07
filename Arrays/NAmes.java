package Arrays;

import java.util.*;

public class NAmes {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        sc.close();

    }
}
