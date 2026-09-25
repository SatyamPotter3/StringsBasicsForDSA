public class RemoveAllSpaces {
    public static void main(String[] args) {
        String str = "Pokemon is a good Anime";
      for(int i=0;i<str.length();i++){
          char c=str.charAt(i);
      if(c!=' '){
          System.out.print(c);
      }
      }


    }}