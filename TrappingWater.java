public class TrappingWater {
    public static void trappingWater(int arr[]) {
        int res = 0;
        int lmax[] = new int[arr.length];
        lmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }

        int rmax[] = new int[arr.length];
        rmax[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        System.out.print(res);
    }

    public static void main(String args[]) {
        int arr[] = { 5, 0, 6, 2, 3 };

        trappingWater(arr);
    }
}
