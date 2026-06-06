import java.util.*;

public class _44factoriel {
    public static int fact(int n){
        if(n==1){
            return n;

        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Factoriel of " +n+ " = " +fact(n));
        
    }
}
