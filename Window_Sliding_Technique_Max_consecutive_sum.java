public class Window_Sliding_Technique_Max_consecutive_sum {
    public static void func(int arr[], int k, int n) {
        int arrsum = 0;
        for (int i = 0; i < k; i++) {
            arrsum += arr[i];
        }
        int maxsum = arrsum;

        for (int i = k; i < n; i++) {
            arrsum += arr[i] - arr[i - k];
            maxsum = Math.max(arrsum, maxsum);
        }

        System.out.print(maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 8, 30, -5, 20, 7 };
        int k = 3;

        func(arr, k, arr.length);
    }
}
