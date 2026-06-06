import java.util.*;

public class _45palindrome_funtion{
    public static int palindrome(int n){
        int sum = 0;
        
        

        while(n>0){
            int rem = n%10;
            sum = sum*10  + rem;
            n = n/10;
        

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
         int n1 = n;

        int ans = palindrome(n);
        if(ans == n1){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }

    }
}