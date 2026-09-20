public class ReverseAWord {
    public static void main(String[] args){
        String str="Java is Love";
        String str1[]=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i= str1.length-1;i>=0;i--){
            result.append(str1[i]).append(" ");
        }
        System.out.println("Reversed word is:"+"="+result+" ");
    }
}
