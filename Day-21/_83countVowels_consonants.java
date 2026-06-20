public class _83countVowels_consonants {
    public static void main(String[] args) {
        String str = "How are you";
        System.out.println(str.length());
        int vowel = 0;
        int consonantes = 0;

        for(int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            
            if(ch>='a' &&ch<='z'){
                if(ch=='a' || ch=='e' || ch =='i' || ch== 'o' || ch =='u'){
                       vowel++;
                }
                else{
                    consonantes++;
                }

            }
        }
        System.out.println("Vowels = "+vowel);
        System.out.println("Consonantes = "+consonantes);
    }
}