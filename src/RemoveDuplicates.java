import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "banana";

        HashSet<Character> set = new HashSet<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(set.add(str.charAt(i))){
                result.append(str.charAt(i));
            }
        }

        System.out.println(result);
    }
}
