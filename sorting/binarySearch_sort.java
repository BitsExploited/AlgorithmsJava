public class bs_sort {
      public static void bsSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  int temp = arr[i];
                  int low = 0;
                  int high = i - 1;

                  while (low <= high) {
                        int mid = low + (high - low) / 2;

                        if (arr[mid] > temp) {
                              high = mid - 1;
                        }
                        else {
                              low = mid + 1;
                        }
                  }
                  for (int j = i; j > low; j--) {
                        arr[j] = arr[j - 1];
                  }
                  arr[low] = temp;
            }

      }

      public static void main(String[] args) {
            int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

            bsSort(arr);

            for (int i : arr) System.out.printf("%d ", i);
      }
}
