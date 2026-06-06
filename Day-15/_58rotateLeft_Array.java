
import java.util.Arrays;

public class _58rotateLeft_Array {



  public static int[] rotateFromK(int arr[], int k) {
    int n = arr.length;
    int result[] = new int[n];

    int idx = 0;

    for (int i = k; i < n; i++) {
        result[idx++] = arr[i];
    }

    for (int i = 0; i < k; i++) {
        result[idx++] = arr[i];
    }

    return result;
}
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int rotatingIndex = 2;
     int rotated[] =   rotateFromK(arr , rotatingIndex);
        System.out.println(Arrays.toString(rotated));
    }
}
