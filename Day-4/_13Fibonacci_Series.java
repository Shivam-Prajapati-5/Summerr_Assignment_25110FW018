import java.util.*;

public class _13Fibonacci_Series{
    public static void fibonacciSeries(int a , int b, int x){
        System.out.print(a+" ");
        System.err.print(b+" ");
        int c;
        for(int i=1 ; i<=x; i++){
             c = a+b;
               a = b;
               b = c;
               System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of term :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
         fibonacciSeries(a,b,n-2);
    }
}