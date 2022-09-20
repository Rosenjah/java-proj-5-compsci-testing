package computer.science.test;

public class InsertionSort {

    // What sorting algorithms have the best runtime efficiency?
    // What are the scenarios for the best case, worst case, and average case runtime efficiency?
    // The answer is it depended on the scenario
    //- Merge Sort is efficient in terms of time and Insertion Sort is efficient in terms of space
    //- Quick Sort is very efficient for sorting small datasets

    public static void main(String[] args) {
        // array sort
        // print array
    }

    public void arrSort (int intArray[]) {

        int intArrayLength = intArray.length;
        for (int i = 0; i < intArrayLength; i++) {
            int presentInt = intArray[i];
            int j = i - 1;

            while (j >= 0 && intArray[j] > presentInt) {
                intArray[j + 1] = intArray[j];
                j = j - 1;
            }

            intArray[j + 1] = presentInt;
        }
    }

    public static void arrPrint(int intArray[]) {

        int intArrayLength = intArray.length;
        for (int i = 0; i < intArrayLength; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
