import java.util.*;

public class _87character_frequency {
    public static void main(String[] args) {
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            boolean visited = false;

            // 
            for(int k=0; k<i; k++){
                if(str.charAt(k) == ch){
                    visited = true;
                    break;
                }
            }
            if(!visited){
                int count = 0;
                
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            System.out.println(ch+" = "+count);
            }
        }

        
    }
}
