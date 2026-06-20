import java.util.*;


public class _91CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s1 = "listen";
       String s2 = "silent";

char[] arr1 = s1.toCharArray();
char[] arr2 = s2.toCharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);

if(Arrays.equals(arr1, arr2)){
    System.out.println("Anagram");
}else{
    System.out.println("Not Anagram");
}
 /*          
char[] arr = {'S', 'h', 'i', 'v', 'a', 'm'};

String str = new String(arr);

System.out.println(str);*/
        

        
    }
}
