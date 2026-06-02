import java.util.*;

public class _16Range_ofArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int j=0;
        int i; 
        int sum = 0;
    
      
        

        for(i=a; i<=b; i++){
            if(i==0){
                System.out.println(i);
                continue;
            }
             
            j =i;
            int count = 0;
            while(j>0){
                j = j/10;
                count++;


            }
            j = i;
            sum =0;
            while(j>0){
                int rem = j%10;
                sum += (int)Math.pow(rem,count);
                j = j/10;

                

            }
             if(sum == i){
            System.out.println(i);
            


        }
       
        
        }
        


        
    }
}
