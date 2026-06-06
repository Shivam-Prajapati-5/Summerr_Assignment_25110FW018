import java.util.*;

public class _48Perfect_number {
    public static int perfect(int n){
        int sum = 0;
        for(int i=1; i<=n/2; i++){
           if(n%i == 0){
            sum = sum + i;
           }
        }
        return sum;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
       int n1 = n;
        int ans  =  perfect(n);
        if(ans == n1){
            System.out.println("The given number is a perfect number :");
        }
        else{
            System.out.println("The given number is not perfect number :");
        }
    }
}
