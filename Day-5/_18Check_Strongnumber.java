import java.util.*;

public class _18Check_Strongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
          int sum = 0;
          int m = n;
        while(n>0){
            int rem = n%10;
          
            int fact = 1;
            for(int i=1; i<=rem; i++){
                fact = fact*i;
            }
            sum = sum+fact;
            n= n/10;
        }
        if(sum == m){
            System.out.println("The given number is a Strong number :");

        }
        else{
            System.out.println("The given number is not a Strong number :");
        }
        
    }
}
