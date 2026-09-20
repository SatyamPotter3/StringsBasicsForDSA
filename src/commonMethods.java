public class commonMethods {
    public static void main(String[] args){
    String str="Hello World";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,5));
        System.out.println(str.indexOf('l'));
        System.out.println(str.contains("ell"));
        String result=str.replace('l','x');
        System.out.println(result);
        System.out.println(str.trim());
        String words[]=str.split(" ");
        for(String word:words){
            System.out.println(word);
        }
        StringBuilder sb = new StringBuilder();

        sb.append('a');
        sb.append('b');

        sb.append('c');
        sb.deleteCharAt(1);
        System.out.println(sb);
    }}
