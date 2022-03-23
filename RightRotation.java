import java.util.Arrays;

public class RightRotation {

    //second method
    public static void right(int arr[],int k){
        reverse(arr,k-1,arr.length-1);
        reverse(arr,0,k-2);
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
        right(arr,3);
        System.out.print(Arrays.toString(arr));
        //rights(arr, 1);
    }
}