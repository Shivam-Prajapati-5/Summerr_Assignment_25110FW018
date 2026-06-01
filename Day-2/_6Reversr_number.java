import java.util.*;

public class _6Reversr_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
    int reverse = 0;

     
        while(n>0){
            int rem =n%10;
            reverse =  10*reverse + rem;
            n = n/10;


        }
        System.out.print("The reverse of a given number = "+reverse);
        
    }
}
