public class linear_search {

      public static int linearSearch(int arr[], int target) {
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == target) {
                        return i;
                  }
            }
            return -1;
      }

      public static void main(String[] args) {
            int arr[] = {34, 21, 56, 87, 4, 2, 83, 98};
            int target = 2;

            int index = linearSearch(arr, target);

            if (index == -1) {
                  System.out.println("The element " + target + " is not found in the array");
            }
            else {
                  System.out.println("The element "  + target + " is found at index " + index);
            }
      }
}
