public class Frequency {
    public static void freq(int arr[]) {
        int freq = 1, i = 1;
        while (i < arr.length) {
            while (i < arr.length && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq = 1;
        }
        if (arr.length == 1 || arr[arr.length - 1] != arr[arr.length - 2]) {
            System.out.print(arr[arr.length - 1] + " " + 1);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 9 };
        freq(arr);
    }
}
