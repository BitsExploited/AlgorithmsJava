public class selection_sort {
      public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                  int min = i;
                  for (int j = i + 1; j < arr.length; j++) {
                        if(arr[min] > arr[j]) {
                              min = j;
                        }
                  }

                  int temp = arr[i];
                  arr[i] = arr[min];
                  arr[min] = temp;
            }
      }

      public static void main(String[] args) {
            int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

            selectionSort(arr);

            for(int i : arr) System.out.printf("%d ", i);
      }
}
