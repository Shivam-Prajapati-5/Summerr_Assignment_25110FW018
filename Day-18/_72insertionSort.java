import java.util.*;

public class _72insertionSort {
    public static void sort(int arr[]){

    
      for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // Descending order
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
        System.out.println(Arrays.toString(arr)+"");

    }
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6};
         // s(ort in desending order
         sort(arr);
    }
}
