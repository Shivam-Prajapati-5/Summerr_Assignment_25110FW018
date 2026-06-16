public class _63pairgivenSum {
    public static void pair(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               if(arr[i] + arr[j] == key){
                System.out.println("(" +arr[i]+ ", "+arr[j]+")");
               }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,8,9,4};
        int key = 5;
        pair(arr ,key);    
}
}