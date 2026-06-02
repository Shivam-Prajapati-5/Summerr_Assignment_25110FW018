import java.util.*;

public class _15Check_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int n1 = n;
        int count = 0;
        while (n>0) {
           n = n/10;
           count++;
            
        }
        int sum = 0;
        n = n1;

        while(n1>0){
            int rem = n1%10;
             sum += (int)Math.pow(rem, count);
             n1 = n1/10;

        }
        if(sum == n){
            System.out.println("The given number is armstrong :");
        }
        else{
            System.out.println("The given number is not Armstong :");
        }

    }
    
    
}
