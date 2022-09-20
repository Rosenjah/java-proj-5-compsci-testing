package computer.science.test;

import org.junit.Test;

public class MissingNumberPerformanceTest {

    private int[] intMissingMax = {1, 2, 3, 4};
    private int[] intMissingNone = {1, 2, 3, 4, 5};
    private int[] intMissingTwo = {1, 3, 4, 5};
    private int intTop = 5;

    private MissingNumber intMissingNum = new MissingNumber();

    @Test(timeout=100)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            intMissingNum.missingNumber(intMissingMax, intTop);
            intMissingNum.missingNumber(intMissingNone, intTop);
            intMissingNum.missingNumber(intMissingTwo, intTop);
        }
    }
}
