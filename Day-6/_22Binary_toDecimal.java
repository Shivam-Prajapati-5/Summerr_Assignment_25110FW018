import java.util.*;

public class _22Binary_toDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number :");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        while(n>0){
            int rem = n%10;
            sum = sum + rem*(int)Math.pow(2,count);
            n = n/10;
            count++;

        }
        
            
       System.out.println("The decimal number = "+sum); 
        
    }
}
