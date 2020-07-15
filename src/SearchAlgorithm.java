public class SearchAlgorithm {

    public static int binarySearch(int[] arr, int number) {
        SortAlgorithm.bubbleSort(arr);
        int low = arr[0];
        int hi = arr[arr.length - 1];
        int mid = (hi + low) / 2;
        while (low <= hi) {

            if (number > arr[mid]) {

                low = mid + 1;
            } else if (number < arr[mid]) {

                hi = mid - 1;
            } else {

                return mid;
            }
            mid = (hi + low) / 2;

        }
        return -1;
    }
}
