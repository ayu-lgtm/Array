public class Equilibrium_pOINT {
    public static int function(int arr[],int n){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        int l_sum=0,i;
        for(i=0;i<n;i++){
            //System.out.println(l_sum+" "+sum);
            if(l_sum==sum-arr[i]){
                return i+1;
            }
            l_sum+=arr[i];
            sum-=arr[i];
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={4,2,2};
        System.out.print(function(arr,arr.length));
    }
}
