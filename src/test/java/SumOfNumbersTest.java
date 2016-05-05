import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by vato on 5/5/16.
 */
public class SumOfNumbersTest {

    @Mock private SumTarget sumTarget;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
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

    @Test
    public void checkSumNumberTarget() {
        when(sumTarget.getTargetNumber()).thenReturn(10);
        SumOfNumbers sumOfNumbers = new SumOfNumbers(sumTarget);
        long actualTargetNumber = sumOfNumbers.getSumTargetNumber();
        long expectedTargetNumber = 10;
        assertEquals("Target number", expectedTargetNumber, actualTargetNumber);
    }
}
