import java.util.*;

public class _51largestAnd_smallest {
    public static void fun(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];

            }
        }
        System.out.println(" maximum value = "+max+" minimum value = "+min);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array element :");
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
          fun(arr);
        
    }
}
