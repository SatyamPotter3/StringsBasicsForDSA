public class shortestWord {
    public static void main(String[] args){
        String str="Pokemon is a very good Anime";
        str=str.toLowerCase();
        String[] c=str.split(" ");
        String shortest=c[0];
        for(int i=0;i<c.length;i++){
            if(c[i].length()<shortest.length()){
                shortest=c[i];
            }
        }
        System.out.println(shortest);
    }
}
