
public  class _92MaximumOccuringCharacter {
    public static void main(String[] args) {
     
        String str = "Shivam Prajapati";
        int max = 0;
        char maxChar = ' ';
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                int   count = 1;
                for(int k=i+1; k<str.length(); k++){
                    if(ch == (str.charAt(k))){
                        count++;
                    }


                }
                if(count>max){
                    max = count;
                    maxChar = ch;
                }
            }
          
            
        }
          System.out.println("Maximujm Occuring chracter = "+maxChar);
            System.out.println("Frequency =" + max);

    }
}
