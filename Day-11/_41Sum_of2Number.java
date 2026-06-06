import java.util.*;

public class _41Sum_of2Number{
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two number :");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Sum = "+sum(n,m));
    }
}