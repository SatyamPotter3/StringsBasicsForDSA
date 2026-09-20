public class Compare {
    public static void main(String[] args){
        String a="Satyam";
        String b=new String("Satyam");
       if(a.equals(b)){
           System.out.println("Same");
       }
       String c="Hello";
       String d="heLLo";
        System.out.println(c.equalsIgnoreCase(d));

    }
}
