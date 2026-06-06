
import java.lang.reflect.Array;
import java.util.Arrays;

public class _59Rightrotation {
    public static int[] rightRotate(int arr[], int k) {
    int n = arr.length;
    int result[] = new int[n];

    int idx = 0;

    for (int i = n - k; i < n; i++) {
        result[idx++] = arr[i];
    }

    for (int i = 0; i < n - k; i++) {
        result[idx++] = arr[i];
    }

    return result;
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 2;
        int rotated[] = rightRotate(arr, key);
        System.out.println(Arrays.toString(rotated));
        
    }
}
