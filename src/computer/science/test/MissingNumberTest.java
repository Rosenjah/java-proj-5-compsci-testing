package computer.science.test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {
    private int[] intMissingMax = {1, 2, 3, 4};
    private int[] intMissingNone = {1, 2, 3, 4, 5};
    private int[] intMissingTwo = {1, 3, 4, 5};

    private MissingNumber intMissingNum = new MissingNumber();

    @Test
    public void testMissingNumber_MissingNone() {
        assertEquals(0, intMissingNum.missingNumber(intMissingNone, 5));
    }

    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(5, intMissingNum.missingNumber(intMissingMax, 5));
    }

    @Test
    public void testMissingNumber_MissingTwo() {
        assertEquals(2, intMissingNum.missingNumber(intMissingTwo, 5));
    }

}
