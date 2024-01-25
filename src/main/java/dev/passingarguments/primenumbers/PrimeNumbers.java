package dev.passingarguments.primenumbers;

public class PrimeNumbers {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        int midpoint = (int) Math.sqrt(n);

        for (int i = 2; i <= midpoint + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int nextPrime(int n) {

        for (int i = n; i <= n + 30; i++) {
            if (isPrime(i)) {
                return i;
            }
        }

        return -1;
    }

    public static int[] primesInRange(int start, int end) {
        String primes = "";

        for (int i = start; i <= end ; i++) {
            if (isPrime(i)) {
                primes += i + " ";
            }
        }

        String[] primesArray = primes.split(" ");
        int[] primeInts = new int[primesArray.length];

        for (int i = 0; i < primesArray.length; i++) {
            primeInts[i] = Integer.valueOf(primesArray[i]);
        }

        return primeInts;
    }

}
