
import java.util.Arrays;

public class _57reverseArray{

    public static void reverse(int arr[]){
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4,5};
        reverse(arr);
    }
}