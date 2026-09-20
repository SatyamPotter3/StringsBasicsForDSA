public class isRotated {
    public static void main(String[] args){  //bhai isme hume check krna hai ki ek string kya doosre ki rotated version hai
        String s="banana";
        String s1="Hello";
        if(s.length()==s1.length() && (s+s).contains(s1)){
            System.out.println("IsRotated");
        }
        else{
            System.out.println("Not");
        }
    }
}
