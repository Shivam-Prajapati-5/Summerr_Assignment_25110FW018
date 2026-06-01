import java.util.*;

public class _11GCD_calculate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min ;
        int gcd = 0;
        int i;

        if(m>n){
            min = n;
        }
        else{
            min= m;
        }
        for(i=1; i<=min; i++){
            if(m%i == 0 && n%i == 0){
                gcd = i;
                
            }
        }
        System.out.println("GCD = "+gcd);
    }
} 