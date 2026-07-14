import java.util.*;

public class ArrayFunction {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // length
        System.out.println("Length of Array : " + arr.length);

        // maximum
        System.out.println(Arrays.stream(arr).max().getAsInt());
        in.close();
    }
}