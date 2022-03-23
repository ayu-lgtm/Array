class Minimum_GRoup_Flips_to_Make_Same {
    public static void function(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("from " + i + " to ");
                } else {
                    System.out.println(i - 1);
                }
            }
        }
        if (arr[n - 1] != arr[0]) {
            System.out.println(n - 1);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 };

        function(arr, arr.length);
    }
}