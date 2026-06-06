import java.util.*;


public class _50Sumand_Avrage {
    public static void funtion(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            

        }
        int avrage = (int)sum/arr.length;
        System.out.println("Sum of array = "+sum);
        System.out.println("Avrage of array = "+avrage);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array element:");
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        funtion(arr);
        
    }
}
