import java.util.*;


public class _88remove_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        String result = "";

           
        for(int i=0; i<str.length(); i++){
          char ch = str.charAt(i);
          if(ch>='a'  && ch<='z'){
            result += ch;
          }
        }
        System.out.println(result+"");
    }
}
