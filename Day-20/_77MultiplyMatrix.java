import java.util.*;

public class _77MultiplyMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int m = 3;
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[m][n];

        System.out.println("Enter first matrix element :");
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array element:");
         
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
    int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){  // n = row 1
            for(int j=0; j<n; j++){  // n = col 2
           arr[i][j] = 0;        
           for(int k=0; k<n; k++){    // k = col 1
            arr[i][j] += arr1[i][k]*arr2[k][j];
         }
           System.out.print(arr[i][j]+" ");     
            }
            System.out.println();
        }
    }
}