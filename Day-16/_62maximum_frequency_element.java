

public class _62maximum_frequency_element {

    public static void search(int arr[]){
         
        int maxFreq = 0;
        int element = arr[0];


        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j=0; j<arr.length; j++){
            if(arr[i] == arr[j]){
                count++;
            }
            }
            if(count>maxFreq){
                maxFreq = count;
                element = arr[i];
            }
        }
        System.out.println("Maximum frequency element = " +element);
        System.out.println("frequency = "+maxFreq);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,1};
        search(arr);

        
    }
}
