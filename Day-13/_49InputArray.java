import java.util.*;

public class _49InputArray{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array element");
        int arr[] = new int[5];
         
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println(Arrays.toString(arr));


       
    }
}