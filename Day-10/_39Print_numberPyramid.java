import java.util.*;

public class _39Print_numberPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // spaces
         for(int j=1; j<=n-i; j++){
            System.out.print("  ");
           }

           for(int j=1; j<=i; j++){

               System.out.print(j+" ");
           }
           for(int j=i-1; j>=1; j--){
            System.out.print(j+" ");
           }
           
        
           System.out.println("");
        }
    }
}
