public class countDigLetSpecChar {
    public static void main(String[] args){   //Here you have to count the no of letters,digits and special chars in a string
        String s1="Hell0 $erena";
        int letters=0;
        int digits=0;
        int special=0;
        s1=s1.toLowerCase();
        s1=s1.trim();
        for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(c>='a' && c<='z'){
    letters++;
} else if(c>='0' && c<='9') {
    digits++;
}
else if(c!=' '){
    special++;
}
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(special);
    }
}
