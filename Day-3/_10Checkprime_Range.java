import java.util.*;

public class _10Checkprime_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Range :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i=a;
        int j=2;

        for( i=a; i<=b; i++){
            if(i<=1){
                continue;
            }
             boolean isPrime = true;
            for(j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
                 if(isPrime){
                System.out.print(i+" ");
                 }
                
        
        }
        
        
    
}}