

public class _67Insertion_Arrays {
    public static void interSection(int arr1[] , int arr2[]){
        int n = Math.min(arr1.length, arr2.length);
        int arr[] = new int[n];
        int k=0;
        for (int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    arr[k] = arr1[i];
                    k++; 
                    break;
                }

            }
        }
        for(int l=0;l<k; l++ ){
            System.out.print(arr[l]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,8,9,3};
        interSection(arr1,arr2);
    }
}
