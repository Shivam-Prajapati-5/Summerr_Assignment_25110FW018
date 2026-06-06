import java.util.*;

public class _47Check_prime {
    public static void prime(int n) {
        boolean isPrime = true;
        for(int i=2; i<n/2; i++){
            isPrime = false;
            break;

        }
if(isPrime){
    System.out.println("The given number is prime :");

}
else{
    System.out.println("not prime");
}
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();

          
     if(n<=1){
        System.out.println("The given number is not prime number :");
     }
        prime(n);

    }
}
