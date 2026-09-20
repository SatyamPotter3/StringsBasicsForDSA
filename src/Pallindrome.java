public class Pallindrome {
    public static void main(String[] args) {
String str="Hello";
str=str.toLowerCase();
int left=0;
int right=str.length()-1;
boolean isPallindrome=true;
while(left<right){

    if(str.charAt(left)!=str.charAt(right)){
     isPallindrome=false;
     break;
    }
    left++;
    right--;

}
if(isPallindrome==true){
    System.out.println("Pallindrome");
}
else{
    System.out.println("Not a Pallindrome");
}
    }
}
