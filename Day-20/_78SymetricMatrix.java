public class _78SymetricMatrix {
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},
                        {1,2,3},
                        {1,2,3}};
   boolean symetric = true;
                   
      for(int i=0; i<arr[0].length; i++){
        for(int j=0; j<arr.length; j++){
            if(arr[j][i]!= arr[i][j]){
               symetric = false;
               break;
            }
           
        }
        if(symetric == false){
            break;
        }
      }

if(symetric == true){
    System.out.println("symetic");
}
else{
    System.out.println(" not symetic");
}
    }
}
