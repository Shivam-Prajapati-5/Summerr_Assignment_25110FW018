
public class _94CompressString {
    public static void main(String[] args) {
        String str = "aaabbbcccdddd";
        String result = "";
        for(int i=0; i<str.length(); i++){
            int count = 1;
            int j = i+1;
             char ch = str.charAt(i);
             while(j<str.length() && str.charAt(j) == ch ){
                count++;
                j++;
             }
             result += ch+ ""+count;
             i=j-1;
        }
        System.out.println(result);
        
    }
}
