public class countOccurences {
    public static void main(String[] args){
        String s="Happening";
        char c='p';
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
