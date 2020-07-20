public class BasicComputerScience {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        //printArray(SortAlgorithm.bubbleSort(arr));
        System.out.print(ArithmaticAlgorithm.getLCM(arr));
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
    }
}
