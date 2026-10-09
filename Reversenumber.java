// if given number is 123 , Output should be 321
public class ReverseNumber {
    
    public int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseNumber RN = new ReverseNumber();
        int ans = RN.reverseNumber(123);
        System.out.println("Reverse= " + ans);
    }
}
// rev=0, num=123
// rev=0*10+123%10=3, num=123/10=12
// rev=3*10+12%10=32, num=12/10=1
// rev=32*10+1%10=321, num=1/10=0