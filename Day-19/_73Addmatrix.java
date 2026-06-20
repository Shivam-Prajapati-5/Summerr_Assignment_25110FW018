import java.util.*;

public class _73Addmatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int m = 3;
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];
        System.out.println("Enter first matrix element :");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                 arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array element :");
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr1[i][j] + arr2[i][j] +" ");
            }
            System.out.println("");
        }
    }
}