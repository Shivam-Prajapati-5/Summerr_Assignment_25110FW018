import java.util.*;

public class _65merge_Array{
    public static int[] merge(int arr1[] , int arr2[]){

        int n = arr1.length + arr2.length;
        int merged[] = new int[n];
           int k =0;
        for(int i=0; i<arr1.length; i++){
            merged[k] = arr1[i];
            k++;
        }
        for(int j=0 ; j<arr2.length; j++){
              merged[k] = arr2[j];
              k++;
        }
        return merged;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
            int arr[] =  merge(arr1, arr2);
            System.out.println(Arrays.toString(arr));
    
 
            // m-2
            //int merged[] = Arrays.copyOf(arr1, arr1.length + arr2.length);
             //System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        
    }
}