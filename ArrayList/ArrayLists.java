package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> anila = new ArrayList<Integer>();
        // add values to the list
        anila.add(12);
        anila.add(31);
        anila.add(15);
        System.out.println(anila);
        System.out.println("The element at index 2 is: " + anila.get(2));
        anila.add(1, 24);
        System.out.println(anila);
        anila.set(2, 30);
        System.out.println("Set value at index 2: " + anila);
        anila.set(3, 29);
        System.out.println("Set value at index 3: " + anila);
        anila.remove(0);

        System.out.println(anila);
        int len = anila.size();
        System.out.println("the size of list is: " + len);
        // loop
        for (int i = 0; i < anila.size(); i++) {
            System.out.println(anila);

            System.out.println(anila.get(i));
        }
        // Sorting of ArrayList

        Collections.sort(anila);
        System.out.println(anila);

        String[] names = { "Java", "Python", "C", "Power BI" };
        ArrayList<String> listname = new ArrayList<String>(Arrays.asList(names));
        System.out.println(listname);

    }
}
