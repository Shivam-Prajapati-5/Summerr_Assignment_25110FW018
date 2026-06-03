import java.util.*;

public class _24aKe_powerb {
    public static int CalculatePower(int x, int n){

int power = 1;

        for(int i=1; i<=n; i++){
             power = power*x; 
        }
         return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base number :");
        int x = sc.nextInt();
        System.out.print("Enter a power number :");
        int n = sc.nextInt();
        if(x==0 || n==0){
              return;
        }

  int sum =   CalculatePower(x,n);  
  System.out.println(x+" ke power "+n+" = "+sum);

    }
    
}
