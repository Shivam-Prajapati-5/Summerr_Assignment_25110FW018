import java.util.*;
public class _21Decimal_tobinary{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;


        while(n>0){
            int rem = n%2;
            sum = sum +rem*(int)Math.pow(10,count);
            n = n/2;
            count++;
        }
        System.out.println("Binary number = "+sum);
    }
}