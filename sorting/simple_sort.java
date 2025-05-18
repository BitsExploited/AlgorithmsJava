public class simple_sort {
      public static void simpleSort(int[] arr) {
            int n = arr.length;

            for (int i = 1; i < n; i++) {
                  for (int j = 0; j < n - 1; j++) {
                        if (arr[j] > arr[i]) {
                              int temp = arr[i];
                              arr[i] = arr[j];
                              arr[j] = temp;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

            simpleSort(arr);

            for (int i : arr) System.out.printf("%d ", i);
      }
}
