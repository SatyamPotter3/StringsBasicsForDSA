public class countVowels {
    public static void main(String[] args) {
        String str = "Hello Serena";
        str = str.toLowerCase();
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;}
               else if (c >= 'a' && c <= 'z') {
                    consonant++;
                } else {

                }
            }
            System.out.println("The no of vowels :" + vowels);
            System.out.println("The no of consonant :" + consonant);
        }
    }
