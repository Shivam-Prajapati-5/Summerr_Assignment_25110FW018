import java.util.*;

public class _28Recursive_reverseNumber {
    public static void  Reverse(int n){

            if (n == 0) {
            return;
        }

        System.out.print(n % 10);
        Reverse(n / 10);
    }
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();

   Reverse(n);
        
    }
}
