public class MaximumConsecutive1s {
    public static void func(int arr[],int n){
        int i=0,count=0,max=0;
        while(i<n){
            if(arr[i]%2==1){
                count++;
            }
            max=Math.max(count,max);
            if(arr[i]%2==0){
                count=0;
            }  
            i++;
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        int arr[]={1,0,0,1,1,1,1,0,0,1,1,1};
        func(arr,arr.length);
    }
}
