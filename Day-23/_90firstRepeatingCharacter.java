import java.util.*;

public class _90firstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            for(int j=i+1; j<str.length(); j++){
                if(ch == str.charAt(j)){
              System.out.println("The first repeating element "+ch);
              return;
                }
            }
        }
       System.out.println("Not found first repeating element :"); 
    }
}
