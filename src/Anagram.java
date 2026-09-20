public class Anagram {
    public static void main(String[] args) {
        //To check whether two Strings are Anagram or not
        String str1 = "Listen";
        String str2 = "Silent";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<str1.length();i++){
           char c= str1.charAt(i);
            freq[c - 'a']++;
        }
        for(int i=0;i<str2.length();i++){
            char c= str2.charAt(i);
            freq[c - 'a']--;
        }
        boolean isAnagram=true;
        for(int i=0;i<26;i++){
            if(str1.length()==str2.length()){
            if(freq[i]!=0){
                isAnagram=false;
                break;
            }          }
        }
        if(isAnagram) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }

    }
}