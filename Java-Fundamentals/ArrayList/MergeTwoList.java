import java.util.*;

public class MergeTwoList {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            list1.add(a);
        }
        for (int i = 0; i < m; i++) {
            int b = in.nextInt();
            list2.add(b);
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        System.out.println("list 1 :" + list1);
        System.out.println("List 2:" + list2);
        list1.sort(null);
        list2.sort(null);
        while (n != 0 && m != 0) {
            if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else if (list1.get(i) > list2.get(j)) {
                list.add(list2.get(j));
                j++;
            } else {
                list.add(list1.get(i));
                i++;
                j++;
            }
            n--;
            m--;
        }
        for (int k = i; k < list1.size(); k++) {
            list.add(list1.get(k));
        }
        for (int k = j; k < list2.size(); k++) {
            list.add(list2.get(k));
        }
        System.out.println("Merged Sorted list : " + list);
        in.close();
    }
}