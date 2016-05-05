import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vato on 5/5/16.
 */
public class SumOfNumbersTest {

    @Test
    public void checkBasicSum() {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        long actualSum = sumOfNumbers.calculateSum(10);
        long expectedSum = 55;
        assertEquals("Checking sum to 10", expectedSum, actualSum);
    }

    @Test
    public void checkNegativeNumber() {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        long actualSum = sumOfNumbers.calculateSum(-5);
        long expectedSum = 0;
        assertEquals("Checking sum to -5", expectedSum, actualSum);
    }
}
