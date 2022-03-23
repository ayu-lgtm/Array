public class MaximumSumCircularSubarray {
    public static int normalsum(int arr[],int n){
        int res=arr[0];
        int maxEnd=arr[0];
        for(int i=1;i<n;i++){
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            res=Math.max(maxEnd,res);
        }
        return res;
    }
    public static void Overallsum(int arr[],int n){
        int normalSum = normalsum(arr,n);
        int arr_sum=0;
        if(normalSum<0){
            System.out.print(normalSum);
            return;
        }
        for(int i=0;i<n;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];
        }

        int maxcircular_subarray_sum = arr_sum+normalsum(arr,n);

        System.out.print(Math.max(maxcircular_subarray_sum,normalSum));

    }
    public static void main(String args[]){
        int arr[]={8,-4,3,-5,4};
        Overallsum(arr,arr.length);
    }
}
