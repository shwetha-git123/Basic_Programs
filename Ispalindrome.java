public class Ispalindrome{
    public void ispalindrome(String s1){
        String s2=reverseString(s1);
        if(s1.equals(s2)){
            boolean ans=true;
            System.out.println("Given String is palindrome");
        }
        else{
            boolean ans=false;
            System.out.println("Given String is not palindrome");
        }
    }
    public static void main(String [] args){
        Ispalindrome p= new Ispalindrome();
        p.ispalindrome("Shwetha");
    }
}