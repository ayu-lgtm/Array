public class MaxOddEvenLength {
    public static void maxoe(int arr[], int n) {
        int curr = 1;
        int res = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }
        System.out.print(res);
    }

    public static void main(String args[]) {
        int arr[] = { 10, 12, 14, 7, 8, 9, 3 };

        maxoe(arr, arr.length);
    }
}
