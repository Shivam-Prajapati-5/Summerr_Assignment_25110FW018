public class _54frequency_element {
    public static void frequency(int arr[] , int key){
        int count = 0;

          for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                count++;
            }
          }
          System.out.println(key+" present in array in "+count + " times");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,2,6,2};
        int key = 2;
        frequency(arr , key);
    }
}
