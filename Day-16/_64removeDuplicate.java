public class _64removeDuplicate {
       
    public static void removeDuplicat(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean dupli = false;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    dupli = true;
                    break;
                }

            }
            if(!dupli){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,1,2,4,3,1};
        removeDuplicat(arr);
        
    }
}
