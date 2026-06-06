public class _56duplicate {
    public static void  duplicate(int arr[]){
        int i=0;
        for(i=0; i<arr.length-1; i++){
            for(int j=0; i<arr.length; j++){
                if(arr[i] == arr[j]){
                    break; 
                }
            }
        }
        System.out.println(arr[i] + " is duplicate");
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,2,4,4};
        duplicate(arr);
    }
}
