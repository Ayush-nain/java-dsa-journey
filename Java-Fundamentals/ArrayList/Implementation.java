import java.util.*;

public class Implementation {
    public static void main(String args[]) {
        // Declaration
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Insert
        list.add(1);
        list.add(4);
        list.add(2);

        // get
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        // set
        list.set(1, 12);
        for (int i = 0; i < list.size(); i++) // loop
        {
            System.out.print(list.get(i) + " ");
        }

        // remove
        list.remove(2);
        // for (int i = 0; i < list.size(); i++) // loop
        // {
        // System.out.print(list.get(i) + " ");
        // }

        // sort
        list.add(3);
        list.add(6);
        // Collections.sort(list);
        list.sort(null);
        System.out.println();
        for (int i = 0; i < list.size(); i++) // loop
        {
            System.out.print(list.get(i) + " ");
        }

    }
}