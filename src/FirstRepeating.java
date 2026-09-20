public class FirstRepeating {
    public static void main(String[] args){
        String str="Swiss";
        str=str.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            freq[c-'a']++;
            if(freq[c-'a']>1){
                break;
            }
        }
        for(int i=0;i<26;i++){
          if(freq[i]>1){
              System.out.println((char)(i+'a')+"="+freq[i]);
          }
        }
    }
}
