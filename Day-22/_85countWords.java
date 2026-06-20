import java.util.*;

public class _85countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        int space= 0;
        int words = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                space++;
            }
            else{
                words++;
            }
        }  
        System.out.println("Total words of a sentence = "+words);      
    }
}
