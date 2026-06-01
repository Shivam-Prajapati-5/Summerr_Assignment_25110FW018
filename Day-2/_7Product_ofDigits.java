import java.util.*;

public class _7Product_ofDigits {
    public static int Digitproduct(int n){
        int product = 1;

        while(n>0){
            int rem = n%10;
            product = product*rem;
            n = n/10;

        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();


        System.out.println("The product of given number ="+Digitproduct(n));
        
    }
}
