public class shell_sort {

      public static void shellSort(int[] arr, int n) {
            for(int gap = n / 2; gap > 0; gap /= 2) {
                  for (int i = 0; i < n; i++) {
                        int temp = arr[i];
                        int j = i;

                        while(j >= gap && arr[j - gap] > temp) {
                              arr[j] = arr[j - gap];
                              j -= gap;
                        }
                        arr[j] = temp;
                  }
            }
      }

      public static void main(String[] args) {
            int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            int n = arr.length;

            shellSort(arr, n);

            for(int i : arr) System.out.printf("%d ", i);
      }
}
