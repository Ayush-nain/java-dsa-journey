import java.util.*;

public class MaximumofList {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            list.add(a);
        }
        int maxi = list.get(0);
        for (int i = 1; i < n; i++) {
            if (maxi < list.get(i)) {
                maxi = list.get(i);
            }
        }
        System.out.println("Maximum = " + maxi);
        in.close();
    }
}