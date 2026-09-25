
public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Pokemon is a good Anime";
        String[] s=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length;i++){
            sb.append(new StringBuilder(s[i]).reverse().append(" "));
        }
        System.out.println(sb);

    }
    }
