public class Palindrome{
    public boolean isPlaindrome(String str){
        String s2="";
        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Palindrome P=new Palindrome();
        boolean ans=P.isPlaindrome("Shwetha");
        System.out.println("Given String is: "+"Shwetha");
        System.out.println("Is Given String palindrome? "+ ans);
    }
}