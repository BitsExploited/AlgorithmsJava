public class quick_sort {
     
      public static int partition(int arr[], int start, int end) {
            int pivot = arr[end];
            int i = start - 1;

            for (int j = start; j < end - 1; j++) {
                  if (arr[j] < pivot) {
                        i++;
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                  }
            }
            i++;
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            return i;
      }

      public static void quickSort(int arr[], int start, int end) {
            if (end <= start) return;
            
            int pivot = partition(arr, start, end);

            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
      }

      public static void main(String[] args) {
            int arr[] = {12, 34, 56, 78, 90, 21, 43, 65, 87, 9};
            quickSort(arr, 0, arr.length - 1);

            for (int i : arr) System.out.printf("%d ", i);
      }
}
