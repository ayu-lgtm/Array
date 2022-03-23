import java.util.Arrays;

class LeftRotation{

    //first method
    /*public static void rights(int arr[],int k){
        int index=0;
        int brr[]=Arrays.copyOf(arr,arr.length);

        for(int i=0;i<arr.length;i++){
            index=(arr.length-k+i)%arr.length;
            arr[index]=brr[i];
        }

        System.out.print(Arrays.toString(arr));
    }
    */
    //second method
    public static void left(int arr[],int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int arr[],int low,int high){
        
        while(low<high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
    public static void swap(int arr[],int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        left(arr,3);
        System.out.print(Arrays.toString(arr));
        //rights(arr, 1);
    }
}