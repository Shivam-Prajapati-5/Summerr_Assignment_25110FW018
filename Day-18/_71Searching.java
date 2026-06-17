

public class _71Searching {
    public static int binarySearch(int arr[] , int searchKey){

        int end = arr.length-1;
        int start = 0;
        

        while(end>=start){
             int mid = start + (end-start)/2;
            if(arr[mid] == searchKey){
               return mid;
            }
            else if(arr[mid]>searchKey){
                end = mid -1;
            }
            else{

                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        int searchKey = 5;

    int ans =    binarySearch(arr,searchKey);
    if(ans != -1){
        System.out.println("Searching key is present in "+ans+"th idx ");
    }
    else{
        System.out.println("Searching key is not present");
    }
        
    }
}
