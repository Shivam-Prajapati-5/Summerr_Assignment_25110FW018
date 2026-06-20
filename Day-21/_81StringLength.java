import java.util.*;

public class _81StringLength{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

     String str = "Shivam ";
     int count = 0;

     for(int i=0; i<str.length(); i++){
        count++;
     }
     System.out.println("Length of Sting ="+count);
    }
}