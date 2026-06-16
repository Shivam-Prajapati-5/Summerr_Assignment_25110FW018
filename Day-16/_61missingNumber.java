
public class _61missingNumber{
    public static int search(int arr[]){
        int sum = 0;
        int n = arr.length+1;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        // first natural sume = n*(n+1)/2
        int actualSum = n*(n+1)/2;
        int missingNumber = actualSum - sum;
        return missingNumber;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};
        int missingNub = search(arr);
        System.out.println("missing number = "+missingNub);

    }
}