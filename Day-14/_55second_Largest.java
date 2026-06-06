public class _55second_Largest {
    public static void secondlargest(int arr[]){
          int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int high = max;
         max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max && arr[i]!=high){
                max = arr[i];
            }
        }
        System.out.println("Second largest element = "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,4,6};
        secondlargest(arr);
    }
}
