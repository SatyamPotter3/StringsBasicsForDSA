public class twoPointers {
    public static void main(String[] args) {
        String str="Hello";
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println(str.charAt(left));
            }
            left++;
            right--;
        }
    }
}