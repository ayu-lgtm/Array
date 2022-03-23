

public class Max_appearing_element {
    public static void main(String args[]) {
        int L[] = { 1, 2, 5, 15 };// elements
        int R[] = { 5, 8, 7, 18 };// range

        int al[] = new int[1000];
        
        for (int i = 0; i < L.length; i++) {
            al[L[i]]++;
            al[R[i]+1]--;
        }

        int maxfreq=0,res=0;
        for(int i=1;i<1000;i++){
            al[i]+=al[i-1];
            if(maxfreq<al[i]){
                maxfreq=al[i];
                res=i;
            }
        }

        System.out.print(res+" "+maxfreq);

    }
}
