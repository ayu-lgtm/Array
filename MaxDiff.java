public class MaxDiff {
    public static void maxDiff(int arr[],int n){
        int res=arr[1]-arr[0];
        int minValue = arr[0];
        for(int i=0;i<n;i++){
            res = Math.max(res,arr[i]-minValue);
            minValue = Math.min(minValue,arr[i]);
        }

        System.out.print(res);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,1,5,7,4,3,1,6};
        maxDiff(arr,arr.length);
    }
}
