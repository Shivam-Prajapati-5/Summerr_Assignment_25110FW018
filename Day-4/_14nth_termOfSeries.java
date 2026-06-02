import java.util.*;

public class _14nth_termOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a term number :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1; 
        int c =0; 
        for(int i=1; i<=n-2; i++){
            c = a+b;
            a=b;
            b=c;

        }
        System.out.println(n+"th Term of Fibonacci Series is = "+c);

        
    }
}
