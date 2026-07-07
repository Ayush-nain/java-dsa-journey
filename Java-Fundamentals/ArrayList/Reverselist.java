import java.util.*;

public class Reverselist {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        int a;
        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            list.add(a);
        }
        System.out.println(list);
        int l = 0, r = n - 1;
        while (l <= r) {
            int temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
            l++;
            r--;
        }
        System.out.println("Reverse List : " + list);
        in.close();
    }
}