import java.util.Arrays;

public class ShiftCountRight {
    public static void shift0(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 0, 9, 8, 0, 6, 0, 7, 4, 0, 4, 2, 0, 0, 5, 3, 0 };

        shift0(arr);

    }
}
