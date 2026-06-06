import java.util.*;

public class _42Write_greaterNumber {
    public static int great(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two number :");
         int n = sc.nextInt();
         int m = sc.nextInt();

         System.out.println("Greater number = " +great(n,m));
 
    }
}
