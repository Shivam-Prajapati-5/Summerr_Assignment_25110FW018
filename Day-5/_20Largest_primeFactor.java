import java.util.*;

public class _20Largest_primeFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

    int largest = -1;
    

        for(int i=2; i<=n; i++){
            if(n%i == 0){
                boolean isPrime = true;

                for(int j=2; j<=i/2; j++){
                       if(i%j == 0){
                    isPrime = false;
                    break;

                       }
                }
                if(isPrime){
                    largest = i;
                }
            
                
            }
        }
        System.out.println("Largest Prime Factor = "+largest);
        
    }
}

        
    

