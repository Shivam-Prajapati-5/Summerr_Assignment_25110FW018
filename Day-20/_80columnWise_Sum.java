public class _80columnWise_Sum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6}};
          for(int i=0; i<arr[0].length; i++){
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                sum += arr[j][i];
            }
            System.out.println(sum+ " ");
          }             
    }
}
