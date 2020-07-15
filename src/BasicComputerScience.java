public class BasicComputerScience {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        System.out.print(SearchAlgorithm.binarySearch(arr, 5));
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
