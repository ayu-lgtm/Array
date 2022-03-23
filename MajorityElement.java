public class MajorityElement {
    public static void major(int arr[], int n) {
        int count = 1;
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;

            } else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }
        if (count <= n / 2) {
            res = -1;
        }

        System.out.print(res);
    }

    public static void main(String args[]) {
        int arr[] = { 8, 8, 6, 6, 6, 4, 6, 8, 8, 8, 8, 8, 8, 8 };
        major(arr, arr.length);
    }
}
