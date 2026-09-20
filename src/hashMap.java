import java.util.HashMap;

public class hashMap {
    public static void main(String[] args){
        String str="Helloo";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
    }
}
