public class _53linearSearch{
    public static int search(int arr[] , int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {2,4,1,3,5};
        int key = 3;
      int index = search(arr,key);
      if(index == -1){
        System.out.println("Searching key is not found ");
      } 
      else{
        System.out.println("The searching key present in "+index+"th index");
      }
        
    }
}