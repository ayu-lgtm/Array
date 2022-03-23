public class MaxSumSubarray {
    public static void maxSum(int arr[],int n){
        int res=arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<n;i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding,res);
        }

        System.out.print(res);
    }
    public static void main(String args[]){
        int arr[]={5,8,3,-1,2,-5};
        maxSum(arr,arr.length);
    }
}
