import java.util.Arrays;

public class Prefix_Sum {
    public static void main(String args[]) {
        int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
        int prefix_sum[] = new int[arr.length];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }

        System.out.print(Arrays.toString(prefix_sum));
    }
}
