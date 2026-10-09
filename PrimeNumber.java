public class PrimeNumber {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber PN = new PrimeNumber();
        int number = 29;
        boolean result = PN.isPrime(number);
        System.out.println(number + " is prime: " + result);
    }
}