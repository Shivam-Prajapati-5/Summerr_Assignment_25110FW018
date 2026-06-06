import java.util.Arrays;

public class _60moveZero_end {
    public static void move(int arr[]){
        int n = arr.length;
    int j=0;
    for(int i=0; i<n; i++){
        if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j]; 
            arr[j] = temp;
            j++;
        }
    }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,5,0,2,0};
        move(arr);
    }
}
