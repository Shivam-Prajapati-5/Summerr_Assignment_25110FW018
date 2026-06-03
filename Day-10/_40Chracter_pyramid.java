
import java.util.*;

public class _40Chracter_pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // spaces
         for(int j=1; j<=n-i; j++){
            System.out.print("  ");
           }

           for(char j='A'; j<'A'+i; j++){

               System.out.print(j+" ");
           }
           for(char j=(char)('A'+i-2); j>='A'; j--){
            System.out.print(j+" ");
           }
           
        
           System.out.println("");
        }
    }
}
