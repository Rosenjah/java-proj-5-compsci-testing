package computer.science.test;

public class MissingNumber {

    //My solution attempts t o sort out the numbers and then stores if the number is skipped as the missing number
    //The provided solution has split its functionality into 2 different method i.e. sorting then traversing to find if any numbers are skipped.

    public static void main (String[] args) {
        int intArr[] = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        missingNumber(intArr, 10);
    }

    public static int missingNumber(int intArray[], int intCheck) {

        int intTempArray[] = new int[intCheck + 1];
        for (int i = 0; i <= intCheck; i++) {
            intTempArray[i] = 0;
        }

        for (int i = 0; i < intCheck; i++) {
            intTempArray[intArray[i] - 1] = 1;
        }

        int intMissing = 0;
        for (int i = 0; i <= intCheck; i++) {
            if (intTempArray[i] == 0)
                intMissing = i + 1;
        }

        return intMissing;

    }
}
