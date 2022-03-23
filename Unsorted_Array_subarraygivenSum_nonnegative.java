public class Unsorted_Array_subarraygivenSum_nonnegative {

    public static boolean function(int arr[],int n,int s){
        int currsum = arr[0];
        int S=0;
        for(int e=1;e<n;e++){
            while(currsum>s && S<e-1){
                currsum-=arr[S];
                S++;
            }
            if(currsum==s)return true;
            if(e<n){
                currsum+=arr[e];
            }
        }
        return(currsum==s);
    }
    public static void main(String args[]) {

        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int k=33;
        System.out.print(function(arr,arr.length,k));

    }
}
