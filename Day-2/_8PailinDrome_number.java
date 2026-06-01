import java.util.*;

public class _8PailinDrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
         int n = sc.nextInt();
          int n1 = n;
          int reverse = 0;


         
       while(n>0){
        int rem = n%10;
        reverse = 10*reverse + rem;
        n = n/10;


       }
       if(reverse == n1){
        System.out.println("The given number is palindrome");
       }
       else{
        System.out.println("The given number is not palindrome");
       }
    }
}
