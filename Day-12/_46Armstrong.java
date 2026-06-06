import java.util.*;


public class _46Armstrong {
    public static int armstrong(int n){
        int count = 0;
        int n2 = n;
        while(n>0){
            n = n/10;
            count++;
        }
         n = n2;
         int sum = 0;

         while(n>0){
            int rem = n%10;
            sum = sum + (int)Math.pow(rem , count);
            n = n/10;
         }
         return  sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int n1 = n;
        int ans = armstrong(n);
        if(ans == n1){
            System.out.println("Tne given number is armstrong ");

        }
        else{
            System.out.println("The given number is not armstrong :");
        }


        
    }
}
