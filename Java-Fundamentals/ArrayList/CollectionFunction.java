
// //Collections Utility Methods
// Collections.sort()
// Collections.reverse()
// Collections.shuffle()
// Collections.frequency()
// Collections.max()
// Collections.min()
import java.util.*;

public class CollectionFunction {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            list.add(a);
        }

        // sort
        Collections.sort(list);
        System.out.println("Sorted Array : " + list);

        // reverse
        Collections.reverse(list);
        System.out.println("Reversed list" + list);

        // shuffle
        Collections.shuffle(list);
        System.out.println("Shuffle list : " + list);

        // Maximum
        int b = Collections.max(list);
        System.out.println("Maximum Element : " + b);

        // Minimum
        int c = Collections.min(list);
        System.out.println("Minimum : " + c);

        in.close();
    }
}