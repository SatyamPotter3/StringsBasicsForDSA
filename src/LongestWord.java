public class LongestWord {
    public static void main(String[] args){    //You have to find the longest word in the String and print it
        String str="Java is my Loveee";        //what you can do is, use another variable of string type and it should be empty " "
        str=str.toLowerCase();                 //now you have the array of char so just compare empty string with first word and
        String longest=" ";                    //assign the first word to longest variable and start comparing with other words you will
         String[] s=str.split(" ");      //soon find the longest word in the String
        for(int i=0;i<s.length;i++){
           if(s[i].length()>longest.length()){
               longest=s[i];
           }  }                                 //there is an important concept being used in this problem i.e. using another variable but empty
                                               // and comparing with other words in an Array
        System.out.println(longest);
    }
}
