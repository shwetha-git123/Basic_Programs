public class SwapTwoNumbers {
    public void swapNumbers(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        SwapTwoNumbers STN = new SwapTwoNumbers();
        STN.swapNumbers(5, 10);
    }
}

// a=10 , b= 20
// a=10+20=30
// b=30-20=10
// a=30-10=20