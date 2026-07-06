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

        // Types of Declaration in ArrayList

        // 1
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(7);
        list2.add(18);

        System.out.println(list2);

        // 2
        List<String> list3 = List.of("Ayush", "Amandeep", "Dev");
        System.out.println(list3);
        // 3
        Double arr[] = { 1.2, 3.57, 0.9 };
        List<Double> list4 = Arrays.asList(arr);
        list4.set(1, 2.33);

        System.out.println(list4);
    }
}