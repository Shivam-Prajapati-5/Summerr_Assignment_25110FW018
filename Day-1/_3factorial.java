
import java.util.*;

public class _3factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        
        System.out.println("Tne factorial of given number = "+fact(n));
    }
}
