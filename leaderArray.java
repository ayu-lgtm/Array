public class leaderArray {
    public static void main(String args[]) {
        int arr[] = { 15, 4, 3, 11, 3, 6, 7, 8, 4, 9, 0 };
        int n = arr.length;
        int curr = arr[n - 1];
        System.out.print(arr[n - 1] + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > curr) {
                System.out.print(arr[i] + " ");
                curr = arr[i];
            }
        }
    }
}
