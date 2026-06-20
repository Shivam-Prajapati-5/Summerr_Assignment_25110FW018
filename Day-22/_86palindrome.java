import java.util.*;
public class _86palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");

        String str = sc.nextLine();
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            result += ch;

        }
        if(result.equals(str)){
         System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome");
        }

    }
}