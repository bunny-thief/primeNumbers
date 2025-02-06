import dev.passingarguments.primenumbers.PrimeNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {

    PrimeNumbers primeNumbers;

    @BeforeEach
    public void createInstance() {
        primeNumbers = new PrimeNumbers();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 19, 23, 29, 41, 101, 1_000_003})
    @DisplayName("Test numbers that are prime")
    void testIsPrime_WithGivenInput_ShouldReturnTrue(int testInput) {
        boolean actual = primeNumbers.isPrime(testInput);

        assertTrue(actual, "Given input should be prime but method returned false");
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8, 9, 10, 27, 33, 39, 1_000_002})
    @DisplayName("Test numbers that are not prime")
    public void testIsPrime_WithGivenInput_ShouldReturnFalse(int testInput) {
        boolean actual = primeNumbers.isPrime(testInput);

        assertFalse(actual, "Given input is not prime but method returned true");
    }

    @ParameterizedTest
    @CsvSource({"3, 3", "5, 5", "41, 41", "101, 101", "563, 563", "997, 997", "1_000_003, 1_000_003"})
    @DisplayName("Test if given number is the next prime")
    public void testNextPrime_WithGivenInput_ShouldReturnTheInput(int testInput, int expected) {
        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected, "Next prime number is incorrect given the input");
    }

    @ParameterizedTest
    @CsvSource({"14, 17", "15, 17", "16, 17", "17, 17"})
    @DisplayName("Test if 17 the next prime")
    public void testNextPrime_GivenSeventeen_ShouldReturnSeventeen(int testInput, int expected) {
        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected, "The result should be 17");
    }

    @ParameterizedTest
    @CsvSource({"14, 14", "14, 15", "14, 16", "14, 14"})
    @DisplayName("Test against incorrect return for the next prime")
    public void testNextPrime_WithGivenInput_ShouldNotReturnWrongNumber(int testInput, int expected) {
        int actual = primeNumbers.nextPrime(testInput);

        assertNotEquals(actual, expected, "Returned incorrect prime given input");
    }

    @ParameterizedTest
    @CsvSource({"40, 41", "41, 41"})
    @DisplayName("Test if 41 is the next prime")
    public void testNextPrime_GivenFortyAndFortyOne_ShouldReturnFortyOne(int testInput, int expected) {
        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected, "Next prime number should be 41");
    }

    @ParameterizedTest
    @CsvSource({"54, 59", "55, 59", "56, 59", "57, 59", "58, 59", "59, 59",})
    @DisplayName("Test if 59 is the next prime")
    public void testNextPrime_WithGivenInputs_ShouldReturnFiftyNine(int testInput, int expected) {
        int actual = primeNumbers.nextPrime(testInput);

        assertEquals(actual, expected, "Next prime number should be 59");
    }

    @Test
    @DisplayName("Test primes in range 2 to 10")
    public void testPrimesInRange_GivenRangeBetweenTwoAndTen_ShouldReturnCorrectRange() {
        int[] actualPrimesInRange = primeNumbers.primesInRange(2, 10);

        assertArrayEquals(actualPrimesInRange, new int[]{2, 3, 5, 7}, "The returned array of numbers doesn't match");
    }

    @Test
    @DisplayName("Test primes in range 11 to 20")
    public void testPrimesInRange_GivenRangeBetweenElevenAndNineteen_ShouldReturnCorrectRange() {
        int[] actualPrimesInRange = primeNumbers.primesInRange(11, 20);

        assertArrayEquals(actualPrimesInRange, new int[]{11, 13, 17, 19}, "The returned array of numbers doesn't match");
    }

    @Test
    @DisplayName("Test primes in range 21 to 30")
    public void testPrimesInRange_GivenRangeBetweenTwentyOneAndThirty_ShouldReturnCorrectRange() {
        int[] actualPrimesInRange = primeNumbers.primesInRange(21, 30);

        assertArrayEquals(actualPrimesInRange, new int[]{23, 29}, "The returned array of numbers doesn't match");
    }

    @Test
    @DisplayName("Test primes in range 31 to 40")
    public void testPrimesInRange_GivenRangeBetweenThirtyOneAndForty_ShouldReturnCorrectRange() {
        int[] actualPrimesInRange = primeNumbers.primesInRange(31, 40);

        assertArrayEquals(actualPrimesInRange, new int[]{31, 37}, "The returned array of numbers doesn't match");
    }

}
