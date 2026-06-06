import java.util.*;

public class _43fibonacci {
    public static int fibonacci(int i){
        if(i == 0 || i== 1){
            return i;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a number of term :");
           int n = sc.nextInt();
           for(int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
           }
    }
}
