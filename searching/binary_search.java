// Binary search only works on a sorted list, to sort the list we can use any sorting algorithms based up on the size of the data

public class binary_search {

      public static int binarySearch(int arr[], int target) {

            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                  int mid = low + (high - low) / 2;

                  if (arr[mid] == target) {
                        return mid;
                  }
                  else if (arr[mid] < target) {
                        low = mid + 1;
                  }
                  else {
                        high = mid - 1;
                  }
            }

            return -1;
      }

      public static void bubbleSort(int arr[]) {
            for (int i = 0; i < arr.length - 1; i++) {
                  for (int j = 0; j < arr.length - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                              int temp = arr[j];
                              arr[j] = arr[j + 1];
                              arr[j + 1] = temp;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            int arr[] = {12, 34, 56, 78, 90, 21, 43, 65, 87, 9}; // Unsorted List
            int target = 21;
            
            // Bubble sort since it is a very small data
            bubbleSort(arr);
            for (int i : arr) System.out.printf("%d ", i); // Printing the sorted list since the indexes are changed from the original one
           System.out.println("\n"); 
            // Binary Search after sorting
            int index = binarySearch(arr, target);

            if(index == -1) {
                  System.out.println("The element " + target + " is not found in the array");
            }
            else {
                  System.out.printf("The element " + target + " is found in the array at the index " + index);
            }
      }
}
