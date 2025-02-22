import java.util.ArrayList;
import java.util.Random;

class SortTest {
    // Method to generate a random array
    public static ArrayList<Integer> generateRandomArray(int size, int bound) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array.add(rand.nextInt(bound)); // Random numbers from 0 to bound-1
        }
        return array;
    }

    public static void main(String[] args) {
        int arraySize = 10_000; // Change to 1000 if performance issues occur
        int bound = 100_000; // Upper bound for random numbers

        // Generate random array
        ArrayList<Integer> originalArray = generateRandomArray(arraySize, bound);

        // Clone the array for fair comparison
        ArrayList<Integer> array1 = new ArrayList<>(originalArray);
        ArrayList<Integer> array2 = new ArrayList<>(originalArray);

        // Measure runtime & memory for bubbleSort1
        System.out.println("Measuring performance for bubbleSort1...");
        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort1(array1));

        // Measure runtime & memory for bubbleSort2
        System.out.println("Measuring performance for bubbleSort2...");
        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort2(array2));
    }
}