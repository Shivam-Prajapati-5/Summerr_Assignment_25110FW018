import java.util.*;

public class _52countEven_odd {
    public static void check(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        System.out.println("Even number = "+count);
        System.out.println("Odd number = "+(arr.length-count));
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array element :");
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        check(arr);
        
    }
}
