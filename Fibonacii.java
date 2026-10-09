public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci F = new Fibonacci();
        int ans = F.fibonacci(5);
        System.out.println("Fibonacci of 5 is: " + ans);
    }
}

// fibonaci of 5= fibonaci of 4 + fibonaci of 3 
// fibonaci of 4= fibonaci of 3 + fibonaci of 2
// fibonaci of 3= fibonaci of 2 + fibonaci of 1