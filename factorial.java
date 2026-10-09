public class factorial {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        factorial F = new factorial();
        int ans = F.factorial(5);
        System.out.println("Factorial of 5 is: " + ans);
    }
}