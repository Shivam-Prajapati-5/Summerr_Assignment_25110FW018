
public class _68common_element {
    public static void common(int arr1[] , int arr2[]){
        int n = Math.min(arr1.length, arr2.length);
        int arr[] = new int[n];
          int k=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr1[i]== arr2[j]){
                    arr[k] = arr1[i];
                    k++;
                    break;
                }
            }

        }
        for(int i=0; i<k; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {2,4,8,3};
        common(arr1, arr2);
        
    }
}
