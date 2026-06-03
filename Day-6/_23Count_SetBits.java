import java.util.*;

public class _23Count_SetBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int n = sc.nextInt();
        int count = 0;

        while(n>0){
            int rem = n%2;
           
            
            if(rem == 1){
                count++;
            
        }
        n = n/2;

    }
    System.out.println("Total number of set Bits = "+count);
}
}